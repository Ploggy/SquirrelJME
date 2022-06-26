// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package javax.microedition.lcdui.game;

import cc.squirreljme.runtime.cldc.debug.Debugging;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class Sprite
	extends Layer
{
	public static final int TRANS_MIRROR =
		2;
	
	public static final int TRANS_MIRROR_ROT180 =
		1;
	
	public static final int TRANS_MIRROR_ROT270 =
		4;
	
	public static final int TRANS_MIRROR_ROT90 =
		7;
	
	public static final int TRANS_NONE =
		0;
	
	public static final int TRANS_ROT180 =
		3;
	
	public static final int TRANS_ROT270 =
		6;
	
	public static final int TRANS_ROT90 =
		5;
	
	public Sprite(Image __a)
	{
		throw Debugging.todo();
	}
	
	public Sprite(Image __a, int __b, int __c)
	{
		throw Debugging.todo();
	}
	
	public Sprite(Sprite __a)
	{
		throw Debugging.todo();
	}
	
	public final boolean collidesWith(Image __a, int __b, int __c, boolean 
		__d)
	{
		throw Debugging.todo();
	}
	
	public final boolean collidesWith(Sprite __a, boolean __b)
	{
		throw Debugging.todo();
	}
	
	public final boolean collidesWith(TiledLayer __a, boolean __b)
	{
		throw Debugging.todo();
	}
	
	public void defineCollisionRectangle(int __a, int __b, int __c, int __d)
	{
		throw Debugging.todo();
	}
	
	public void defineReferencePixel(int __a, int __b)
	{
		throw Debugging.todo();
	}
	
	public final int getFrame()
	{
		throw Debugging.todo();
	}
	
	public int getFrameSequenceLength()
	{
		throw Debugging.todo();
	}
	
	public int getRawFrameCount()
	{
		throw Debugging.todo();
	}
	
	public int getRefPixelX()
	{
		throw Debugging.todo();
	}
	
	public int getRefPixelY()
	{
		throw Debugging.todo();
	}
	
	public void nextFrame()
	{
		throw Debugging.todo();
	}
	
	@Override
	public final void paint(Graphics __a)
	{
		throw Debugging.todo();
	}
	
	public void prevFrame()
	{
		throw Debugging.todo();
	}
	
	public void setCollisionAlpha(int __a)
	{
		throw Debugging.todo();
	}
	
	public void setFrame(int __a)
	{
		throw Debugging.todo();
	}
	
	public void setFrameSequence(int[] __a)
	{
		throw Debugging.todo();
	}
	
	public void setImage(Image __a, int __b, int __c)
	{
		throw Debugging.todo();
	}
	
	public void setRefPixelPosition(int __a, int __b)
	{
		throw Debugging.todo();
	}
	
	public void setTransform(int __a)
	{
		throw Debugging.todo();
	}
}


