// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package javax.bluetooth;

import cc.squirreljme.runtime.cldc.annotation.Api;
import java.io.IOException;
import javax.microedition.io.Connection;

@Api
public interface L2CAPConnectionNotifier
	extends Connection
{
	@Api
	L2CAPConnection acceptAndOpen()
		throws IOException;
}
