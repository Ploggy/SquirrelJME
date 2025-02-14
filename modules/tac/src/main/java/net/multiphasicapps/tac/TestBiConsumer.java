// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package net.multiphasicapps.tac;

import cc.squirreljme.runtime.cldc.annotation.SquirrelJMEVendorApi;
import org.junit.Test;

/**
 * This is a test which takes two parameters and produces no result.
 *
 * @param <A> The first argument type.
 * @param <B> The second argument type.
 * @since 2018/10/06
 */
@SquirrelJMEVendorApi
public abstract class TestBiConsumer<A, B>
	extends __CoreTest__
{
	/**
	 * Runs the specified test.
	 *
	 * @param __a The first parameter.
	 * @param __b The second parameter.
	 * @throws Throwable On any thrown exception.
	 * @since 2018/10/06
	 */
	@Test
	@SquirrelJMEVendorApi
	public abstract void test(A __a, B __b)
		throws Throwable;
	
	/**
	 * {@inheritDoc}
	 * @since 2018/10/06
	 */
	@Override
	@SuppressWarnings({"unchecked"})
	@SquirrelJMEVendorApi
	final Object __runTest(Object... __args)
		throws Throwable
	{
		// {@squirreljme.error BU03 Test takes two parameters.}
		if (__args.length != 2)
			throw new InvalidTestParameterException("BU03");
		
		// Run the test
		this.test((A)__args[0], (B)__args[1]);
		
		// No result is generated
		return new __NoResult__();
	}
}

