package saucedemo.web

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class ObjectData {

	public static final String firstName = "Muhamad"
	public static final String lastName = "Rizki"
	public static final String postalCode = "16770"
	public static final String usernameValid = "standard_user"
	public static final String usernameLocked = "locked_out_user"
	public static final String passwordValid= "secret_sauce"
	public static final String passwordInvalid = "secret"
	public static final String errorMessageInvalid = "Epic sadface: Username and password do not match any user in this service'"
	public static final String errorMessageLocked = "Epic sadface: Sorry, this user has been locked out.'"
}

