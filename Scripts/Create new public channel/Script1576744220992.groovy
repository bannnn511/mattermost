import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-usecase.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    Email)

WebUI.setEncryptedText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    Password)

WebUI.click(findTestObject('Object Repository/CreateNewPublicChannel/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/span_'))

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/input_Name_newChannelName'), 
    'Code')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_(optional)_newChannelPurpose'), 
    's')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_s'), 
    'so')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_so'), 
    'sou')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_sou'), 
    'sour')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_sour'), 
    'sourc')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_sourc'), 
    'source')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_(optional)_newChannelHeader'), 
    'c')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_c'), 
    'co')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_co'), 
    'cod')

WebUI.setText(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/textarea_cod'), 
    'code')

WebUI.click(findTestObject('Object Repository/CreateNewPublicChannel/Page_Town Square - Rednit Mattermost/span_Create New Channel'))

WebUI.closeBrowser()
