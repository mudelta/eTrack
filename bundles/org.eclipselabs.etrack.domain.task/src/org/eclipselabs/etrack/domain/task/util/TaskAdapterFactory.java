/**
 * Copyright (c) 2011 Bryan Hunt.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 */
package org.eclipselabs.etrack.domain.task.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.etrack.domain.task.*;
import org.eclipselabs.etrack.domain.task.AssignableItem;
import org.eclipselabs.etrack.domain.task.Attachment;
import org.eclipselabs.etrack.domain.task.Comment;
import org.eclipselabs.etrack.domain.task.State;
import org.eclipselabs.etrack.domain.task.StateTransition;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskPackage;
import org.eclipselabs.etrack.domain.task.TaskType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskPackage
 * @generated
 */
public class TaskAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaskPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = TaskPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSwitch<Adapter> modelSwitch =
		new TaskSwitch<Adapter>()
		{
			@Override
			public Adapter caseAssignableItem(AssignableItem object)
			{
				return createAssignableItemAdapter();
			}
			@Override
			public Adapter caseTask(Task object)
			{
				return createTaskAdapter();
			}
			@Override
			public Adapter caseState(State object)
			{
				return createStateAdapter();
			}
			@Override
			public Adapter caseStateTransition(StateTransition object)
			{
				return createStateTransitionAdapter();
			}
			@Override
			public Adapter caseTaskDomain(TaskDomain object)
			{
				return createTaskDomainAdapter();
			}
			@Override
			public Adapter caseComment(Comment object)
			{
				return createCommentAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object)
			{
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object)
			{
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseStateTransitionMap(Map.Entry<State, EList<StateTransition>> object)
			{
				return createStateTransitionMapAdapter();
			}
			@Override
			public Adapter caseAttachmentData(AttachmentData object)
			{
				return createAttachmentDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.AssignableItem <em>Assignable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.AssignableItem
	 * @generated
	 */
	public Adapter createAssignableItemAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Task
	 * @generated
	 */
	public Adapter createTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.State
	 * @generated
	 */
	public Adapter createStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.StateTransition
	 * @generated
	 */
	public Adapter createStateTransitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskDomain
	 * @generated
	 */
	public Adapter createTaskDomainAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.TaskType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>State Transition Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStateTransitionMapAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipselabs.etrack.domain.task.AttachmentData <em>Attachment Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipselabs.etrack.domain.task.AttachmentData
	 * @generated
	 */
	public Adapter createAttachmentDataAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //TaskAdapterFactory
