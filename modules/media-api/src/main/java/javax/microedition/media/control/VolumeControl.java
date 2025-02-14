// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package javax.microedition.media.control;

import cc.squirreljme.runtime.cldc.annotation.Api;
import javax.microedition.media.Control;

@Api
public interface VolumeControl
	extends Control
{
	@Api
	int getLevel();
	
	@Api
	boolean isMuted();
	
	@Api
	int setLevel(int __a);
	
	@Api
	void setMute(boolean __a);
}


