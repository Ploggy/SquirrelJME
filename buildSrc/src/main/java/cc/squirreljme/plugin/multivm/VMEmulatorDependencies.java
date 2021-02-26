// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// Multi-Phasic Applications: SquirrelJME
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// SquirrelJME is under the GNU General Public License v3+, or later.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package cc.squirreljme.plugin.multivm;

import java.util.Arrays;
import java.util.concurrent.Callable;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.tasks.TaskContainer;

/**
 * This class is used to provide the dependency lookup for the emulator
 * backend, this is so the emulator is built.
 *
 * @since 2020/08/16
 */
public final class VMEmulatorDependencies
	implements Callable<Iterable<Task>>
{
	/** The task referencing this. */
	protected final Task task;
	
	/** The virtual machine type. */
	protected final VMSpecifier vmType;
	
	/**
	 * Initializes the dependencies.
	 * 
	 * @param __task The task to reference.
	 * @param __vmType The virtual machine type.
	 * @throws NullPointerException On null arguments.
	 * @since 2020/08/16
	 */
	public VMEmulatorDependencies(VMExecutableTask __task,
		VMSpecifier __vmType)
		throws NullPointerException
	{
		if (__task == null || __vmType == null)
			throw new NullPointerException("NARG");
		
		this.task = __task;
		this.vmType = __vmType;
	}
	
	/**
	 * {@inheritDoc}
	 * @since 2020/08/16
	 * @return
	 */
	@Override
	public Iterable<Task> call()
	{
		Project root = this.task.getProject().getRootProject();
		
		TaskContainer emu = root.project(this.vmType.emulatorProject())
			.getTasks();
		TaskContainer emuBase = root.project(":emulators:emulator-base")
			.getTasks();
		
		return Arrays.<Task>asList(
			emu.getByName("jar"),
			emu.getByName("assemble"),
			emuBase.getByName("jar"),
			emuBase.getByName("assemble"),
			emuBase.getByName("assembleDebug"),
			emuBase.getByName("assembleRelease"));
	}
}
