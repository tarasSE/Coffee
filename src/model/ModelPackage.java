/**
 */
package model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Author:taras.
 * Created:11/17/17 12:42 PM.
 * Title:.
 * Comment:.
 * 
 * <!-- end-model-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Model'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.TestDIagramImpl <em>Test DIagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TestDIagramImpl
	 * @see model.impl.ModelPackageImpl#getTestDIagram()
	 * @generated
	 */
	int TEST_DIAGRAM = 0;

	/**
	 * The number of structural features of the '<em>Test DIagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Test DIagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link model.impl.CoffeeImpl <em>Coffee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CoffeeImpl
	 * @see model.impl.ModelPackageImpl#getCoffee()
	 * @generated
	 */
	int COFFEE = 1;

	/**
	 * The feature id for the '<em><b>Coffeine Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE__COFFEINE_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Coffee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Coffee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.CupImpl <em>Cup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CupImpl
	 * @see model.impl.ModelPackageImpl#getCup()
	 * @generated
	 */
	int CUP = 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUP__VOLUME = 0;

	/**
	 * The feature id for the '<em><b>Coffee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUP__COFFEE = 1;

	/**
	 * The feature id for the '<em><b>Water</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUP__WATER = 2;

	/**
	 * The number of structural features of the '<em>Cup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUP_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link model.impl.WaterImpl <em>Water</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.WaterImpl
	 * @see model.impl.ModelPackageImpl#getWater()
	 * @generated
	 */
	int WATER = 3;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER__TEMPERATURE = 0;

	/**
	 * The feature id for the '<em><b>Clean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER__CLEAN = 1;

	/**
	 * The number of structural features of the '<em>Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Water</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link model.TestDIagram <em>Test DIagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test DIagram</em>'.
	 * @see model.TestDIagram
	 * @generated
	 */
	EClass getTestDIagram();

	/**
	 * Returns the meta object for class '{@link model.Coffee <em>Coffee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee</em>'.
	 * @see model.Coffee
	 * @generated
	 */
	EClass getCoffee();

	/**
	 * Returns the meta object for the attribute '{@link model.Coffee#getCoffeineValue <em>Coffeine Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coffeine Value</em>'.
	 * @see model.Coffee#getCoffeineValue()
	 * @see #getCoffee()
	 * @generated
	 */
	EAttribute getCoffee_CoffeineValue();

	/**
	 * Returns the meta object for class '{@link model.Cup <em>Cup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cup</em>'.
	 * @see model.Cup
	 * @generated
	 */
	EClass getCup();

	/**
	 * Returns the meta object for the attribute '{@link model.Cup#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see model.Cup#getVolume()
	 * @see #getCup()
	 * @generated
	 */
	EAttribute getCup_Volume();

	/**
	 * Returns the meta object for the reference '{@link model.Cup#getCoffee <em>Coffee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coffee</em>'.
	 * @see model.Cup#getCoffee()
	 * @see #getCup()
	 * @generated
	 */
	EReference getCup_Coffee();

	/**
	 * Returns the meta object for the reference '{@link model.Cup#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Water</em>'.
	 * @see model.Cup#getWater()
	 * @see #getCup()
	 * @generated
	 */
	EReference getCup_Water();

	/**
	 * Returns the meta object for class '{@link model.Water <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water</em>'.
	 * @see model.Water
	 * @generated
	 */
	EClass getWater();

	/**
	 * Returns the meta object for the attribute '{@link model.Water#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see model.Water#getTemperature()
	 * @see #getWater()
	 * @generated
	 */
	EAttribute getWater_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link model.Water#isClean <em>Clean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clean</em>'.
	 * @see model.Water#isClean()
	 * @see #getWater()
	 * @generated
	 */
	EAttribute getWater_Clean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.TestDIagramImpl <em>Test DIagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TestDIagramImpl
		 * @see model.impl.ModelPackageImpl#getTestDIagram()
		 * @generated
		 */
		EClass TEST_DIAGRAM = eINSTANCE.getTestDIagram();
		/**
		 * The meta object literal for the '{@link model.impl.CoffeeImpl <em>Coffee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CoffeeImpl
		 * @see model.impl.ModelPackageImpl#getCoffee()
		 * @generated
		 */
		EClass COFFEE = eINSTANCE.getCoffee();
		/**
		 * The meta object literal for the '<em><b>Coffeine Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COFFEE__COFFEINE_VALUE = eINSTANCE.getCoffee_CoffeineValue();
		/**
		 * The meta object literal for the '{@link model.impl.CupImpl <em>Cup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CupImpl
		 * @see model.impl.ModelPackageImpl#getCup()
		 * @generated
		 */
		EClass CUP = eINSTANCE.getCup();
		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUP__VOLUME = eINSTANCE.getCup_Volume();
		/**
		 * The meta object literal for the '<em><b>Coffee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUP__COFFEE = eINSTANCE.getCup_Coffee();
		/**
		 * The meta object literal for the '<em><b>Water</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUP__WATER = eINSTANCE.getCup_Water();
		/**
		 * The meta object literal for the '{@link model.impl.WaterImpl <em>Water</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.WaterImpl
		 * @see model.impl.ModelPackageImpl#getWater()
		 * @generated
		 */
		EClass WATER = eINSTANCE.getWater();
		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER__TEMPERATURE = eINSTANCE.getWater_Temperature();
		/**
		 * The meta object literal for the '<em><b>Clean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WATER__CLEAN = eINSTANCE.getWater_Clean();

	}

} //ModelPackage
