// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

import net.multiphasicapps.tac.TestConsumer;

/**
 * Tests a basic consumer.
 *
 * @since 2018/10/06
 */
public class DoConsumer
	extends TestConsumer<String>
{
	/**
	 * {@inheritDoc}
	 * @since 2018/10/06
	 */
	@Override
	public void test(String __s)
	{
		this.secondary("input", __s);
	}
}

