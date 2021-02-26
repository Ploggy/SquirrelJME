// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// Multi-Phasic Applications: SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package cc.squirreljme.jvm.summercoat.ld.pack;

import cc.squirreljme.jvm.Assembly;
import cc.squirreljme.jvm.mle.brackets.JarPackageBracket;
import cc.squirreljme.jvm.mle.constants.ByteOrderType;
import cc.squirreljme.jvm.summercoat.constants.ClassInfoConstants;
import cc.squirreljme.jvm.summercoat.constants.PackProperty;
import cc.squirreljme.jvm.summercoat.ld.mem.AbstractReadableMemory;
import cc.squirreljme.jvm.summercoat.ld.mem.ReadableMemoryInputStream;
import cc.squirreljme.jvm.summercoat.ld.mem.RealMemory;
import cc.squirreljme.runtime.cldc.debug.Debugging;
import java.io.IOException;

/**
 * This class is used to access the pack ROM.
 *
 * @since 2021/02/09
 */
public final class PackRom
{
	/** The base address of the ROM. */
	protected final long baseAddr;
	
	/** Properties for the ROM. */
	private final int[] _properties;
	
	/** Libraries which are already available. */
	private JarPackageBracket[] _libraries;
	
	/** The table of contents for this ROM. */
	private TableOfContents _toc;
	
	/**
	 * Initializes the pack ROM manager.
	 * 
	 * @param __memAddr The memory address where the Pack ROM is located.
	 * @param __properties Properties for the ROM.
	 * @since 2021/02/09
	 */
	private PackRom(long __memAddr, int[] __properties)
	{
		this.baseAddr = __memAddr;
		this._properties = __properties;
	}
	
	/**
	 * Returns all of the libraries that are available for the ROM.
	 * 
	 * @return The libraries.
	 * @since 2021/02/09
	 */
	public final JarPackageBracket[] libraries()
	{
		// Return pre-existing set if it is done already
		JarPackageBracket[] rv = this._libraries;
		if (rv != null)
			return rv.clone();
		
		Assembly.breakpoint();
		throw Debugging.todo();
	}
	
	/**
	 * Returns the table of contents.
	 * 
	 * @return The table of contents.
	 * @since 2021/02/22
	 */
	private TableOfContents __toc()
	{
		TableOfContents rv = this._toc;
		if (rv != null)
			return rv;
		
		// Setup new table of contents
		this._toc = (rv = new TableOfContents());
		return rv;
	}
	
	/**
	 * Loads the PackRom from the given address.
	 * 
	 * @param __memAddr The memory address where the ROM is located.
	 * @return The pack ROM of the given address.
	 * @since 2021/02/14
	 */
	public static PackRom load(long __memAddr)
	{
		// Parse the header for the pack file
		AbstractReadableMemory headerMem = new RealMemory(__memAddr,
			ClassInfoConstants.PACK_MAXIMUM_HEADER_SIZE,
			ByteOrderType.BIG_ENDIAN);
		try (ReadableMemoryInputStream in = headerMem.inputStream())
		{
			// {@squirreljme.error ZZ43 Invalid ROM header. (Magic number)}
			int romMagic = in.readInt();
			if (ClassInfoConstants.PACK_MAGIC_NUMBER != romMagic)
				throw new RuntimeException("ZZ43 " + romMagic);
				
			// Read the format version
			int formatVersion = in.readUnsignedShort();
			
			// {@squirreljme.error ZZ44 Cannot decode pack file because the
			// version identifier is not known. (The format version of the pack
			// file)}
			if (formatVersion != ClassInfoConstants.CLASS_VERSION_20201129)
				throw new RuntimeException("ZZ44 " + formatVersion);
			
			// Read in all the data
			int numProperties = Math.min(in.readUnsignedShort(),
				PackProperty.NUM_PACK_PROPERTIES);
			int[] properties = new int[numProperties];
			for (int i = 0; i < numProperties; i++)
				properties[i] = in.readInt();
			
			// Build the final PackROM
			return new PackRom(__memAddr, properties);
		}
		
		// {@squirreljme.error ZZ42 The ROM is corrupted.}
		catch (IOException __e)
		{
			throw new RuntimeException("ZZ42", __e); 
		}
	}
}
