// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// Multi-Phasic Applications: SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package cc.squirreljme.vm.springcoat.brackets;

import cc.squirreljme.jvm.mle.brackets.UIItemBracket;

/**
 * This wraps a native {@link UIItemBracket}.
 *
 * @since 2020/07/18
 */
public final class UIItemObject
	extends UIWidgetObject
{
	/** The item to wrap. */
	public final UIItemBracket item;
	
	/**
	 * Initializes the item object.
	 * 
	 * @param __item The item to wrap.
	 * @throws NullPointerException On null arguments.
	 * @since 2020/07/18
	 */
	public UIItemObject(UIItemBracket __item)
		throws NullPointerException
	{
		super(UIItemBracket.class);
		
		if (__item == null)
			throw new NullPointerException("NARG");
		
		this.item = __item;
	}
	
	/**
	 * {@inheritDoc}
	 * @since 2020/09/20
	 */
	@Override
	public UIItemBracket widget()
	{
		return this.item;
	}
}
