// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package com.vodafone.v10.system.media;

import cc.squirreljme.runtime.cldc.debug.Debugging;
import java.io.IOException;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public class MediaPlayer extends Canvas {
    public static final int NO_DATA = 0;
    public static final int READY = 1;
    public static final int PLAYING = 2;
    public static final int PAUSED = 3;
    public static final int ERROR = 65536;

    public MediaPlayer(byte[] var1) {
    }

    public MediaPlayer(String var1) throws IOException {
    }

    public void setMediaData(byte[] var1)
	{
		throw Debugging.todo();
	}

    public void setMediaData(String var1) throws IOException
	{
		throw Debugging.todo();
	}

    public int getState()
	{
		throw Debugging.todo();
	}

    public int getMediaWidth()
	{
		throw Debugging.todo();
	}

    public int getMediaHeight()
	{
		throw Debugging.todo();
	}

    @Override
	public int getWidth()
	{
		throw Debugging.todo();
	}

    @Override
	public int getHeight()
	{
		throw Debugging.todo();
	}

    public void setContentPos(int var1, int var2)
	{
		throw Debugging.todo();
	}

    public void play()
	{
		throw Debugging.todo();
	}

    public void play(boolean var1)
	{
		throw Debugging.todo();
	}

    public void stop()
	{
		throw Debugging.todo();
	}

    public void pause()
	{
		throw Debugging.todo();
	}

    public void resume()
	{
		throw Debugging.todo();
	}

    public void setMediaPlayerListener(MediaPlayerListener var1)
	{
		throw Debugging.todo();
	}

    @Override
	protected  void paint(Graphics var1)
	{
		throw Debugging.todo();
	}

    @Override
	protected  void showNotify()
	{
		throw Debugging.todo();
	}

    @Override
	protected  void hideNotify()
	{
		throw Debugging.todo();
	}
}

