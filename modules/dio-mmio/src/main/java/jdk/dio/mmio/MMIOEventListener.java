// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package jdk.dio.mmio;

import cc.squirreljme.runtime.cldc.annotation.Api;
import jdk.dio.DeviceEventListener;

@Api
public interface MMIOEventListener
	extends DeviceEventListener
{
	@Api
	void eventDispatched(MMIOEvent __e);
}

