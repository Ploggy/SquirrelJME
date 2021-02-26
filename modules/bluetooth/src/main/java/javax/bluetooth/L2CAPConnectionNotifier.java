// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// Multi-Phasic Applications: SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package javax.bluetooth;

import java.io.IOException;
import javax.microedition.io.Connection;

public interface L2CAPConnectionNotifier
	extends Connection
{
	@SuppressWarnings("RedundantThrows")
	L2CAPConnection acceptAndOpen()
		throws IOException;
}
