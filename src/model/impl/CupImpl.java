/**
 */
package model.impl;

import model.Coffee;
import model.Cup;
import model.ModelPackage;

import model.Water;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.CupImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link model.impl.CupImpl#getCoffee <em>Coffee</em>}</li>
 *   <li>{@link model.impl.CupImpl#getWater <em>Water</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CupImpl extends MinimalEObjectImpl.Container implements Cup {
	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected double volume = VOLUME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getCoffee() <em>Coffee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoffee()
	 * @generated
	 * @ordered
	 */
	protected Coffee coffee;
	/**
	 * The cached value of the '{@link #getWater() <em>Water</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected Water water;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(double newVolume) {
		double oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUP__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coffee getCoffee() {
		if (coffee != null && coffee.eIsProxy()) {
			InternalEObject oldCoffee = (InternalEObject)coffee;
			coffee = (Coffee)eResolveProxy(oldCoffee);
			if (coffee != oldCoffee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CUP__COFFEE, oldCoffee, coffee));
			}
		}
		return coffee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coffee basicGetCoffee() {
		return coffee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoffee(Coffee newCoffee) {
		Coffee oldCoffee = coffee;
		coffee = newCoffee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUP__COFFEE, oldCoffee, coffee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Water getWater() {
		if (water != null && water.eIsProxy()) {
			InternalEObject oldWater = (InternalEObject)water;
			water = (Water)eResolveProxy(oldWater);
			if (water != oldWater) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CUP__WATER, oldWater, water));
			}
		}
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Water basicGetWater() {
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWater(Water newWater) {
		Water oldWater = water;
		water = newWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUP__WATER, oldWater, water));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CUP__VOLUME:
				return getVolume();
			case ModelPackage.CUP__COFFEE:
				if (resolve) return getCoffee();
				return basicGetCoffee();
			case ModelPackage.CUP__WATER:
				if (resolve) return getWater();
				return basicGetWater();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.CUP__VOLUME:
				setVolume((Double)newValue);
				return;
			case ModelPackage.CUP__COFFEE:
				setCoffee((Coffee)newValue);
				return;
			case ModelPackage.CUP__WATER:
				setWater((Water)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.CUP__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case ModelPackage.CUP__COFFEE:
				setCoffee((Coffee)null);
				return;
			case ModelPackage.CUP__WATER:
				setWater((Water)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.CUP__VOLUME:
				return volume != VOLUME_EDEFAULT;
			case ModelPackage.CUP__COFFEE:
				return coffee != null;
			case ModelPackage.CUP__WATER:
				return water != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //CupImpl
