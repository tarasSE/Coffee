/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coffee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Coffee#getCoffeineValue <em>Coffeine Value</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getCoffee()
 * @model
 * @generated
 */
public interface Coffee extends EObject {

	/**
	 * Returns the value of the '<em><b>Coffeine Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coffeine Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coffeine Value</em>' attribute.
	 * @see #setCoffeineValue(double)
	 * @see model.ModelPackage#getCoffee_CoffeineValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getCoffeineValue();

	/**
	 * Sets the value of the '{@link model.Coffee#getCoffeineValue <em>Coffeine Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coffeine Value</em>' attribute.
	 * @see #getCoffeineValue()
	 * @generated
	 */
	void setCoffeineValue(double value);
} // Coffee
