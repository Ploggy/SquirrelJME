// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package mleui.forms;

import cc.squirreljme.jvm.mle.brackets.UIDisplayBracket;
import cc.squirreljme.jvm.mle.brackets.UIFormBracket;
import cc.squirreljme.jvm.mle.brackets.UIItemBracket;
import cc.squirreljme.jvm.mle.constants.UIItemType;
import cc.squirreljme.runtime.lcdui.mle.UIBackend;

/**
 * Tests that item showing works.
 *
 * @since 2020/07/18
 */
public class TestShowItems
	extends BaseUIForm
{
	/**
	 * {@inheritDoc}
	 * @since 2020/07/18
	 */
	@Override
	protected void test(UIBackend __backend, UIDisplayBracket __display,
		UIFormBracket __form)
	{
		for (int i = 0; i < UIItemType.NUM_TYPES; i++)
		{
			// Create the item
			UIItemBracket item = __backend.itemNew(i);
			
			// Show it
			__backend.formItemPosition(__form, item, 0);
			this.secondary("pos-" + i,
				__backend.formItemPosition(__form, item));
			
			// Then quickly delete it
			__backend.formItemRemove(__form, 0);
			__backend.itemDelete(item);
		}
	}
}
