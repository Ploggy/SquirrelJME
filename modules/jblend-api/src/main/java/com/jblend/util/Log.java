// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package com.jblend.util;

import cc.squirreljme.runtime.cldc.debug.Debugging;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public final class Log
{
    public static final PrintStream out =
    	Debugging.<PrintStream>todoObject();
    	
    public static final PrintStream err =
    	Debugging.<PrintStream>todoObject();

    public Log()
	{
		throw Debugging.todo();
	}

    public static final void out(String var0)
	{
		throw Debugging.todo();
	}

    public static final void err(String var0)
	{
		throw Debugging.todo();
	}

    private static final class PrivateOutputStream extends OutputStream {
        @Override
		public void write(int var1) throws IOException
		{
			throw Debugging.todo();
		}
    }
}

