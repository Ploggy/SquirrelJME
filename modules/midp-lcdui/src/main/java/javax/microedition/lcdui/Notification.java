// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package javax.microedition.lcdui;

import cc.squirreljme.runtime.cldc.debug.Debugging;

public class Notification
{
	/** Cache of the used label. */
	private volatile String _label;
	
	/** Cache of the used image. */
	private volatile Image _image;
	
	public Notification(NotificationType __t)
	{
		throw Debugging.todo();
	}
	
	public Notification(NotificationType __t, String __l)
	{
		throw Debugging.todo();
	}
	
	public Notification(NotificationType __t, String __l, Image __i)
	{
		throw Debugging.todo();
	}
	
	public long getTimeStamp()
	{
		throw Debugging.todo();
	}
	
	public NotificationType getType()
	{
		throw Debugging.todo();
	}
	
	public void post(boolean __s)
	{
		Debugging.todoNote("Update mutable image on post.", new Object[] {});
		throw Debugging.todo();
	}
	
	public void post(boolean __s, int __dur)
	{
		Debugging.todoNote("Update mutable image on post.", new Object[] {});
		throw Debugging.todo();
	}
	
	public void remove()
	{
		throw Debugging.todo();
	}
	
	/**
	 * Sets the image to be displayed for this notification. If the image is
	 * mutable then this will take a snapshot of the image and use that
	 * snapshot instead of the normal image.
	 *
	 * A new snapshot is always taken when the post command is called.
	 *
	 * @param __i The image to set or {@code null} to clear it.
	 * @since 2018/04/06
	 */
	public void setImage(Image __i)
	{
		throw Debugging.todo();
		/*
		Image clone = (__i != null && __i.isMutable() ?
			Image.createImage(__i) : __i);
		LcdServiceCall.voidCall(LcdFunction.SET_IMAGE, this._handle,
			(__i == null ? -1 : __i._handle),
			(clone == null ? -1 : clone._handle));
		this._image = __i;
		*/
	}
	
	public void setLabel(String __l)
	{
		throw Debugging.todo();
	}
	
	public void setListener(NotificationListener __nl)
	{
		throw Debugging.todo();
	}
}

