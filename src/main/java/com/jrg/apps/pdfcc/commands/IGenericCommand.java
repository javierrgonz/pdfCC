/**
 * 
 */
package com.jrg.apps.pdfcc.commands;

/**
 * The GenericCommand
 * @author Javier RG
 *
 */
public interface IGenericCommand {

	/**
	 * PreExecute operations 
	 */
	public void preExecute();
	
	/**
	 * Execute operations
	 */
	public void execute();
	
	/**
	 * PostExecute operations
	 */
	public void postExecute();
	
}
