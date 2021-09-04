// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// Multi-Phasic Applications: SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package cc.squirreljme.jvm.summercoat.constants;

import cc.squirreljme.jvm.summercoat.ld.pack.PackRom;
import cc.squirreljme.jvm.summercoat.ld.pack.TableOfContents;

/**
 * Flags for {@link TableOfContents} in {@link PackRom}.
 *
 * @since 2021/09/03
 */
public interface PackTocFlag
{
	/**
	 * Resource item, not a JAR but a data file, this can be a manifest file
	 * for i-Mode for example.
	 */
	byte RESOURCE =
		1;
}
