// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package cc.squirreljme.vm.springcoat;

import cc.squirreljme.emulator.MLECallWouldFail;
import cc.squirreljme.jvm.mle.TerminalShelf;
import cc.squirreljme.jvm.mle.brackets.PipeBracket;
import cc.squirreljme.jvm.mle.constants.PipeErrorType;
import cc.squirreljme.vm.springcoat.brackets.PipeObject;
import cc.squirreljme.vm.springcoat.exceptions.SpringMLECallError;
import java.io.IOException;

/**
 * Functions for {@link MLETerminal}.
 *
 * @since 2020/06/18
 */
public enum MLETerminal
	implements MLEFunction
{
	/** {@link TerminalShelf#close(PipeBracket)}. */
	CLOSE("close:(Lcc/squirreljme/jvm/mle/brackets/PipeBracket;)I")
	{
		/**
		 * {@inheritDoc}
		 * @since 2020/07/06
		 */
		@Override
		public Object handle(SpringThreadWorker __thread, Object... __args)
		{
			try
			{
				MLETerminal.__pipe(__args[0]).pipe.close();
				
				return null;
			}
			catch (IOException|MLECallWouldFail e)
			{
				throw new SpringMLECallError(e.getMessage(), e);
			}
		}
	}, 
	
	/** {@link TerminalShelf#flush(PipeBracket)}. */
	FLUSH("flush:(Lcc/squirreljme/jvm/mle/brackets/PipeBracket;)I")
	{
		/**
		 * {@inheritDoc}
		 * @since 2020/06/18
		 */
		@Override
		public Object handle(SpringThreadWorker __thread, Object... __args)
		{
			try
			{
				MLETerminal.__pipe(__args[0]).pipe.flush();
				
				return PipeErrorType.NO_ERROR;
			}
			catch (IOException|MLECallWouldFail e)
			{
				throw new SpringMLECallError(e.getMessage(), e);
			}
		}
	},
	
	/** {@link TerminalShelf#fromStandard(int)}. */
	FROM_STANDARD("fromStandard:(I)" +
		"Lcc/squirreljme/jvm/mle/brackets/PipeBracket;")
	{
		/**
		 * {@inheritDoc}
		 * @since 2022/03/19
		 */
		@Override
		public Object handle(SpringThreadWorker __thread, Object... __args)
		{
			try
			{
				return new PipeObject(__thread.machine,
					__thread.machine.terminalPipes.mleGet((int)__args[0]));
			}
			catch (MLECallWouldFail e)
			{
				throw new SpringMLECallError(e);
			}
		}
	}, 
	
	/** {@link TerminalShelf#write(PipeBracket, int)}. */
	WRITE_BYTE("write:(Lcc/squirreljme/jvm/mle/brackets/PipeBracket;I)I")
	{
		/**
		 * {@inheritDoc}
		 * @since 2020/06/18
		 */
		@Override
		public Object handle(SpringThreadWorker __thread, Object... __args)
		{
			try
			{
				MLETerminal.__pipe(__args[0]).pipe
					.write((int)__args[1]);
				
				return 1;
			}
			catch (IOException|MLECallWouldFail e)
			{
				throw new SpringMLECallError(e.getMessage(), e);
			}
		}
	},
	
	/** {@link TerminalShelf#write(PipeBracket, byte[], int, int)}. */
	WRITE_BYTES("write:(Lcc/squirreljme/jvm/mle/brackets/PipeBracket;" +
		"[BII)I")
	{
		/**
		 * {@inheritDoc}
		 * @since 2020/06/18
		 */
		@Override
		public Object handle(SpringThreadWorker __thread, Object... __args)
		{
			try
			{
				if (!(__args[1] instanceof SpringArrayObjectByte))
					throw new SpringMLECallError("Not a byte array.");
				
				SpringArrayObjectByte buf = (SpringArrayObjectByte)__args[1];
				int off = (int)__args[2];
				int len = (int)__args[3];
				
				MLETerminal.__pipe(__args[0]).pipe
					.write(buf.array(), off, len);
				return len;
			}
			catch (IOException|MLECallWouldFail e)
			{
				throw new SpringMLECallError(e.getMessage(), e);
			}
		}
	},
	
	/* End. */
	;
	
	/** The dispatch key. */
	protected final String key;
	
	/**
	 * Initializes the dispatcher info.
	 *
	 * @param __key The key.
	 * @throws NullPointerException On null arguments.
	 * @since 2020/06/18
	 */
	MLETerminal(String __key)
		throws NullPointerException
	{
		if (__key == null)
			throw new NullPointerException("NARG");
		
		this.key = __key;
	}
	
	/**
	 * {@inheritDoc}
	 * @since 2020/06/18
	 */
	@Override
	public String key()
	{
		return this.key;
	}
	
	/**
	 * Ensures that this is a {@link PipeObject}.
	 * 
	 * @param __object The object to check.
	 * @return As a {@link PipeObject}.
	 * @throws SpringMLECallError If this is not one.
	 * @since 2022/03/19
	 */
	static PipeObject __pipe(Object __object)
		throws SpringMLECallError
	{
		if (!(__object instanceof PipeObject))
			throw new SpringMLECallError("Not a PipeObject.");
		
		return (PipeObject)__object; 
	}
}
