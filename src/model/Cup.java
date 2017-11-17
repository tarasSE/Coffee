/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Cup#getVolume <em>Volume</em>}</li>
 *   <li>{@link model.Cup#getCoffee <em>Coffee</em>}</li>
 *   <li>{@link model.Cup#getWater <em>Water</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getCup()
 * @model
 * @generated
 */
public interface Cup extends EObject {

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(double)
	 * @see model.ModelPackage#getCup_Volume()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getVolume();

	/**
	 * Sets the value of the '{@link model.Cup#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(double value);

	/**
	 * Returns the value of the '<em><b>Coffee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coffee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coffee</em>' reference.
	 * @see #setCoffee(Coffee)
	 * @see model.ModelPackage#getCup_Coffee()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Coffee getCoffee();

	/**
	 * Sets the value of the '{@link model.Cup#getCoffee <em>Coffee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coffee</em>' reference.
	 * @see #getCoffee()
	 * @generated
	 */
	void setCoffee(Coffee value);

	/**
	 * Returns the value of the '<em><b>Water</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water</em>' reference.
	 * @see #setWater(Water)
	 * @see model.ModelPackage#getCup_Water()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Water getWater();

	/**
	 * Sets the value of the '{@link model.Cup#getWater <em>Water</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water</em>' reference.
	 * @see #getWater()
	 * @generated
	 */
	void setWater(Water value);
} // Cup
