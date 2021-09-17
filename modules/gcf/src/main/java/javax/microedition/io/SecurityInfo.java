// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package javax.microedition.io;

import javax.microedition.pki.Certificate;

public interface SecurityInfo
{
	String getCipherSuite();
	
	Certificate getClientCertificate();
	
	String getProtocolName();
	
	String getProtocolVersion();
	
	Certificate getServerCertificate();
}


