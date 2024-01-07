package saucedemo.web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.security.PublicKey

import org.eclipse.persistence.internal.helper.CustomObjectInputStream

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import saucedemo.utility.CustomTestObject as CustomObject

public class ObjectPath {

	public static final fieldUsername = CustomObject.getCSSTestObject("#user-name")
	public static final fieldPassword = CustomObject.getCSSTestObject("#password")
	public static final buttonLogin = CustomObject.getCSSTestObject("#login-button")
	public static final errorMessageLocked = CustomObject.getCSSTestObject("h3")
	public static final errorMessageInvalid = CustomObject.getCSSTestObject("h3")
	public static final buttonLogout = CustomObject.getCSSTestObject("logout_sidebar_link")
	public static final productSort = CustomObject.getCSSTestObject(".product_sort_container")
	public static final sortAsDescending = CustomObject.getXpathTestObject("//option[.='Name (Z to A)']")
	public static final addProductToCart = CustomObject.getCSSTestObject("[name='add-to-cart-test.allthethings()-t-shirt-(red)']")
	public static final removeProduct = CustomObject.getCSSTestObject("[name='remove-test.allthethings()-t-shirt-(red)']")
	public static final iconCart = CustomObject.getCSSTestObject(".shopping_cart_link")
	public static final buttonCheckout = CustomObject.getCSSTestObject("#checkout")
	public static final fieldFirstName = CustomObject.getCSSTestObject("#first-name")
	public static final fieldLastName = CustomObject.getCSSTestObject("#last-name")
	public static final fieldPostalCode = CustomObject.getCSSTestObject("#postal-code")
	public static final buttonContinue = CustomObject.getCSSTestObject("#continue")
	public static final buttonFinish = CustomObject.getCSSTestObject("#finish")
	public static final successNotif = CustomObject.getCSSTestObject(".complete-header")
	public static final buttonBackToHomepage = CustomObject.getCSSTestObject("#back-to-products")
}



