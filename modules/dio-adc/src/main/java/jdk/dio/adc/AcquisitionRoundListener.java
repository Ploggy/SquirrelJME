// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package jdk.dio.adc;

import java.nio.IntBuffer;
import jdk.dio.InputRoundListener;

public interface AcquisitionRoundListener
	extends InputRoundListener<ADCChannel, IntBuffer>
{
	
}


