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

WebUI.setText(findTestObject('CreateNewTeam/Page_Mattermost/input_All team communication in one place s_703ef5'), Email)

WebUI.setEncryptedText(findTestObject('CreateNewTeam/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    Password)

WebUI.sendKeys(findTestObject('CreateNewTeam/Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('CreateNewTeam/Page_Town Square - Rednit Mattermost/div_'))

WebUI.setText(findTestObject('CreateNewTeam/Page_Town Square - Rednit Mattermost/input_Team Name_teamNameInput'), 'RVUnderground')

WebUI.click(findTestObject('CreateNewTeam/Page_Town Square - Rednit Mattermost/button_Next'))

WebUI.click(findTestObject('CreateNewTeam/Page_Town Square - Rednit Mattermost/span_Finish'))

WebUI.closeBrowser()

