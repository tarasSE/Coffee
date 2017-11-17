/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Water#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link model.Water#isClean <em>Clean</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getWater()
 * @model
 * @generated
 */
public interface Water extends EObject {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(double)
	 * @see model.ModelPackage#getWater_Temperature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTemperature();

	/**
	 * Sets the value of the '{@link model.Water#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Clean</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clean</em>' attribute.
	 * @see #setClean(boolean)
	 * @see model.ModelPackage#getWater_Clean()
	 * @model default="true" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isClean();

	/**
	 * Sets the value of the '{@link model.Water#isClean <em>Clean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clean</em>' attribute.
	 * @see #isClean()
	 * @generated
	 */
	void setClean(boolean value);

} // Water
