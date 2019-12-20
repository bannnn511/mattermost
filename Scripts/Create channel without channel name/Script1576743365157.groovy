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

WebUI.navigateToUrl('https://mattermost-usecase.herokuapp.com')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'bannnnn')

WebUI.setEncryptedText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    '6M8jdlTs8n6rOnocPaG5Cw==')

WebUI.click(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/span_'))

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_(optional)_newChannelPurpose'), 
    't')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_t'), 
    'te')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_te'), 
    'tes')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_tes'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_(optional)_newChannelHeader'), 
    't')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_t_1'), 
    'te')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_te_1'), 
    'tes')

WebUI.setText(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/textarea_tes_1'), 
    'test')

WebUI.click(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/button_Create New Channel'))

WebUI.click(findTestObject('Object Repository/Private channel/Create private channel without channel name/Page_Town Square - test-case Mattermost/button_Create New Channel'))

WebUI.closeBrowser()

