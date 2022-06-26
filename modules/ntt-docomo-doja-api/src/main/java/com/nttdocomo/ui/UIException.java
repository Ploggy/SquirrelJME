// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package com.nttdocomo.ui;

/**
 * This is thrown when there is an exception in the code.
 *
 * @since 2021/11/30
 */
public class UIException
	extends RuntimeException
{
	public static final int BUSY_RESOURCE =
		3;
		
	public static final int ILLEGAL_STATE =
		1;
		
	public static final int NO_RESOURCES =
		2;
		
	public static final int STATUS_FIRST =
		0;
		
	public static final int STATUS_LAST =
		63;
		
	public static final int UNDEFINED =
		0;
		
	public static final int UNSUPPORTED_FORMAT =
		4;
	
	/** Represents the status of the exception. */
	private final int _status;
	
	public UIException()
	{
		this(UIException.UNDEFINED);
	}
	
	public UIException(int __status)
	{
		this(__status, null);
	}
	
	public UIException(int __status, String __message)
	{
		super(__message);
		
		this._status = __status;
	}
	
	public int getStatus()
	{
		return this._status;
	}
}
