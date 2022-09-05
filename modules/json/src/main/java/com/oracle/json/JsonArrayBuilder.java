// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package com.oracle.json;

/**
 * This is a builder which is able to generate {@link JsonArray}s, it also
 * makes it possible to chain them together as successive object calls (most
 * of the methods return {@code this}.
 *
 * @since 2014/07/25
 */
public interface JsonArrayBuilder
{
	/**
	 * Adds {@link JsonValue#TRUE} or {@link JsonValue#FALSE}.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(boolean __v);
	
	/**
	 * Adds a {@link JsonNumber}.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @throws NumberFormatException If {@code __v} is an infinity or NaN.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(double __v);
	
	/**
	 * Adds a {@link JsonNumber}.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(int __v);
	
	/**
	 * Adds a {@link JsonArray} from the specified builder.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @throws NullPointerException If {@code __v} is null.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(JsonArrayBuilder __v);
	
	/**
	 * Adds a {@link JsonObject} from the specified builder.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @throws NullPointerException If {@code __v} is null.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(JsonObjectBuilder __v);
	
	/**
	 * Adds a value to the array.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @throws NullPointerException If {@code __v} is null.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(JsonValue __v);
	
	/**
	 * Adds a {@link JsonNumber}.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(long __v);
	
	/**
	 * Adds a {@link JsonString}.
	 *
	 * @param __v The value to add.
	 * @return {@code this}.
	 * @throws NullPointerException If {@code __v} is null.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder add(String __v);
	
	/**
	 * Adds {@link JsonValue#NULL} to the array.
	 *
	 * @return {@code this}.
	 * @since 2014/07/25
	 */
	JsonArrayBuilder addNull();
	
	/**
	 * Returns the current array as a {@link JsonArray}.
	 *
	 * @return A freshly constructed array.
	 * @since 2014/07/25
	 */
	JsonArray build();
}

