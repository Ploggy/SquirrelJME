// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// Multi-Phasic Applications: SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package dev.shadowtail.classfile.summercoat.register;

/**
 * This class contains the base storage for a register.
 *
 * @since 2020/11/24
 */
public abstract class Register
{
	/** The register Id. */
	public final int register;
	
	/**
	 * Initializes the basic register.
	 * 
	 * @param __register The register to get.
	 * @since 2020/11/24
	 */
	protected Register(int __register)
	{
		this.register = __register;
	}
	
	/**
	 * Returns this value as an integer value.
	 * 
	 * @return This register as an int value register.
	 * @since 2020/11/28
	 */
	public IntValueRegister asIntValue()
	{
		return IntValueRegister.of(this.register);
	}
	
	/**
	 * Uses the same register in this class, but as a plain register.
	 * 
	 * @return The plain register.
	 * @since 2020/11/24
	 */
	public final PlainRegister asPlain()
	{
		if (this instanceof PlainRegister)
			return (PlainRegister)this;
		
		return new PlainRegister(this.register);
	}
	
	/**
	 * {@inheritDoc}
	 * @since 2020/11/24
	 */
	@Override
	public boolean equals(Object __o)
	{
		if (__o == this)
			return true;
		
		if (!(__o instanceof Register))
			return false;
		
		return this.getClass() == __o.getClass() &&
			this.register == ((Register)__o).register;
	}
	
	/**
	 * {@inheritDoc}
	 * @since 2020/11/24
	 */
	@Override
	public int hashCode()
	{
		return this.getClass().hashCode() ^ this.register;
	}
	
	/**
	 * {@inheritDoc}
	 * @since 2020/11/24
	 */
	@Override
	public String toString()
	{
		String className = this.getClass().getName();
		int ld = className.lastIndexOf('.');
		
		return (ld < 0 ? className : className.substring(ld + 1)) +
			"#" + this.register;
	}
}
