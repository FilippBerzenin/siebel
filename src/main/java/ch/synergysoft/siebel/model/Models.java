package ch.synergysoft.siebel.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

@Service
public class Models {

    public static final String SISAccountListApplet = "{\n" +
            "\t\"Link\": [\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"self\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet\",\n" +
            "\t\t      \"name\": \"Applet\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"canonical\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet\",\n" +
            "\t\t\"name\": \"Applet\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletMessage\",\n" +
            "\t\t\"name\": \"Applet Message\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/List\",\n" +
            "\t\t\"name\": \"List\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/Chart\",\n" +
            "\t\t\"name\": \"Chart\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/Tree\",\n" +
            "\t\t\"name\": \"Tree\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletWebTemplate\",\n" +
            "\t\t\"name\": \"Applet Web Template\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletBrowserScript\",\n" +
            "\t\t\"name\": \"Applet Browser Script\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://slc05krw/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletUserProp\",\n" +
            "\t\t\"name\": \"Applet User Prop\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletLocale\",\n" +
            "\t\t\"name\": \"Applet Locale\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletToggle\",\n" +
            "\t\t\"name\": \"Applet Toggle\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletServerScript\",\n" +
            "\t\t\"name\": \"Applet Server Script\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletScript\",\n" +
            "\t\t\"name\": \"Applet Script\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/DrilldownObject\",\n" +
            "\t\t\"name\": \"Drilldown Object\"\t\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/Control\",\n" +
            "\t\t\"name\": \"Control\"\n" +
            "\t\t},\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SIS Account List Applet/AppletMethodMenuItem\",\n" +
            "\t\t\"name\": \"Applet Method Menu Item\"\n" +
            "\t\t}\n" +
            "\t],\n" +
            "\t\"ObjectLockedById\": \"\",\n" +
            "\t\"AutoQueryMode\": \"\",\n" +
            "\t\"PopupDimension\": \"\",\n" +
            "\t\"Class\": \"CSSFrameListBase\",\n" +
            "\t\"NoInsert\": \"N\",\n" +
            "\t\"HelpIdentifier\": \"ID_APPLET_ACCOUNT_LIST\",\n" +
            "\t\"ProjectLocked\": \"Y\",\n" +
            "\t\"MailAddressField\": \"\",\n" +
            "\t\"Name\": \"SIS Account List Applet\",\n" +
            "\t\"BrowserClass\": \"\",\n" +
            "\t\"ICLUpgradePath\": \"\",\n" +
            "\t\"ProjectUIFreezeById\": \"\",\n" +
            "\t\"HTMLPopupDimension\": \"\",\n" +
            "\t\"workspace/MyWorkspaceName\": \"Siebel workspace/MyWorkspace\", \"MailTemplate\": \"\",\n" +
            "\t\"BusinessComponent\": \"Account\",\n" +
            "\t\"HTMLNumberOfRows\": \"\",\n" +
            "\t\"ProjectLockedLanguage\": \"ENU\",\n" +
            "\t\"Title-StringReference\": \"SBL_ACCOUNTS-1009090115-23Y\", \"Title-BaseRow\": \"\",\n" +
            "\t\"ApplicationCode\": \"\",\n" +
            "\t\"SearchSpecification\": \"\",\n" +
            "\t\"Scripted\": \"N\",\n" +
            "\t\"ResponsiveFlag\": \"Y\",\n" +
            "\t\"ServiceApplicationUse\": \"\",\n" +
            "\t\"TextStyle\": \"\",\n" +
            "\t\"BackgroundBitmap\": \"\",\n" +
            "\t\"NoUpdate\": \"N\",\n" +
            "\t\"workspace/MyWorkspaceId\": \"88-4NW-1\",\n" +
            "\t\"ObjectLocked\": \"N\",\n" +
            "\t\"Title-RefDefault\": \"Accounts\", \"DefaultAppletMethod\": \"\", \"ToolsApplicationUse\": \"\", \"DefaultDoubleClickMethod\": \"\", \"Height\": \"4\",\n" +
            "\t\"NoDelete\": \"N\",\n" +
            "\t\"Module\": \"\",\n" +
            "\t\"ObjectLockedDate\": \"\", \"ObjectLanguageLocked\": \"ENU\", \"Comments\": \"7.5.2.200 UI ENHANCEMENT\", \"Task\": \"\",\n" +
            "\t\"Title-RefExact\": \"Accounts\", \"UpgradeAncestor\": \"\",\n" +
            "\t\"ProjectLockedById\": \"0-1\",\n" +
            "\t\"ProjectId\": \"88-4NW-4Y3\",\n" +
            "\t\"InsertApplet\": \"\",\n" +
            "\t\"BackgroundBitmapStyle\": \"\", \"DisableDatalossWarning\": \"N\", \"ProjectUIFreeze\": \"N\",\n" +
            "\t\"InsertPosition\": \"\",\n" +
            "\t\"SalesApplicationUse\": \"\",\n" +
            "\t\"Width\": \"2\",\n" +
            "\t\"ObjectLockedByName\": \"\",\n" +
            "\t\"Inactive\": \"N\",\n" +
            "\t\"UpgradeBehavior\": \"Preserve\",\n" +
            "\t\"Type\": \"Standard\",\n" +
            "\t\"LanguageCode\": \"\",\n" +
            "\t\"AssociateApplet\": \"Agg Account Assoc Applet\", \"Title-StringOverride\": \"\",\n" +
            "\t\"ProjectName\": \"VERT CUT Common\",\n" +
            "\t\"ListName\": \"List\",\n" +
            "\t\"NoMerge\": \"N\"\n" +
            "}";

    public static final String WriteRecord = "{\n" +
            "  \"workspace/MyWorkspaceApplet\": {\n" +
            "\"Link\": {\n" +
            "\"rel\": \"self\",\n" +
            "\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/SISAccountListApplet_1\",\n" +
            "\"name\": \"Applet\"\n" +
            "},\n" +
            "    \"Name\": \"SISAccountListApplet_1\"\n" +
            "  }\n" +
            "}";

    public static final String SISAccountListApplet_1 = "{\n" +
            "  \"workspace/MyWorkspaceApplet\": {\n" +
            "\"Link\": {\n" +
            "\"rel\": \"self\",\n" +
            "\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/\n" +
            "       SIS Account List Applet_1\",\n" +
            "      \"name\": \"Applet\"\n" +
            "      },\n" +
            "      \"Name\": \"SIS Account List Applet_1\",\n" +
            "      \"UpgradeBehavior\": \"Preserve\",\n" +
            "      \"ProjectName\": \"VERT CUT Common\",\n" +
            "      \"Comments\": \"New Record_Applet\"\n" +
            "} }";

    public static final String WriteRecordLonger = "{\n" +
            "  \"workspace/MyWorkspaceApplet\": {\n" +
            "\t\"Link\": {\n" +
            "\t\"rel\": \"self\",\n" +
            "\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/workspace/MyWorkspace/Applet/ SIS Account List Applet_1\",\n" +
            "\t\"name\": \"Applet\"\n" +
            "\t},\n" +
            "    \"Name\": \"SIS Account List Applet_1\"\n" +
            "  }\n" +
            "}";

    public static final String GetAccount884XVPD = "{\n" +
            "\t\"Link\": [\n" +
            "\t\t{\n" +
            "\t\t\"rel\": \"self\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD\", \"name\": \"Account\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"canonical\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD\", \"name\": \"Account\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ UT Account Partner\",\n" +
            "\t\t\"name\": \"UT Account Partner\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ TAF Product Catalog Product Category\",\n" +
            "\t\t\"name\": \"TAF Product Catalog Product Category\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ TAF Assortment Plan2\",\n" +
            "\t\t\"name\": \"TAF Assortment Plan2\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ Revenue Plan\",\n" +
            "\t\t\"name\": \"Revenue Plan\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/ Account/88-4XVPD/ Retail Product\",\n" +
            "\t\t\"name\": \"Retail Product\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ Retail Audit Product\",\n" +
            "\t\t\"name\": \"Retail Audit Product\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ RTD Retention Actions (B2B)\",\n" +
            "\t\t\"name\": \"RTD Retention Actions (B2B)\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ Pharma Account Call - CE\",\n" +
            "\t\t\"name\": \"Pharma Account Call - CE\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ My Account Offer\",\n" +
            "\t\t\"name\": \"My Account Offer\"\n" +
            "\t\t}, {\n" +
            "\t\t\"rel\": \"child\",\n" +
            "\t\t\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD/ FINCORP Subsidiary\",\n" +
            "\t\t\"name\": \"FINCORP Subsidiary\"\n" +
            "\t\t}\n" +
            "\t],\n" +
            "\t\"SBA Review\": \"\",\n" +
            "\t\"Friday End Time 2\": \"\",\n" +
            "\t\"Saturday End Time 2\": \"\",\n" +
            "\t\"Modified By Name\": \"SADMIN\",\n" +
            "\t\"Friday End Time 1\": \"\",\n" +
            "\t\"Saturday End Time 1\": \"\",\n" +
            "\t\"Our Position\": \"\",\n" +
            "\t\"Supply Characteristics\": \"\",\n" +
            "\t\"DeDup Key Modification Date\": \"\", \"Prospect Flag\": \"N\",\n" +
            "\t\"Market Share\": \"\",\n" +
            "\t\"Statement Date\": \"\",\n" +
            "\t\"Reference Stage\": \"\",\n" +
            "\t\"Alt Email Address Type\": \"\", \"Business Description\": \"\",\n" +
            "\t\"Fin Acct - Approx Annual Sales\": \"\", \"Start Date\": \"\",\n" +
            "\t\"Contact Id\": \"\",\n" +
            "\t\"Price List End Date\": \"\",\n" +
            "\t\"Disable DataCleansing\": \"N\", \"Experian Id\": \"\",\n" +
            "\t\"Preferred Shipping Method\": \"\", \"Project Fix Fee\": \"\"\n" +
            "}";

    public static final String PutAccount884XVPD = "{\n" +
            "\"items\": {\n" +
            "\"Link\": {\n" +
            "\"rel\": \"self\",\n" +
            "\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD\", \"name\": \"Account\"\n" +
            "},\n" +
            "\"Name\": \"AccountExample\",\n" +
            "\"Id\": \"88-4XVPD\",\n" +
            "\"Location\": \"Albany\",\n" +
            "\"Primary Organization Id\": \"1SIA-7SY3\",\n" +
            "\"Primary Organization\": \"Medical Products MD ENU\", \"Description\": \"AccountData\"\n" +
            "}\n" +
            "}";

    public static final String Account = "{\n" +
            "\"items\": {\n" +
            "\"Link\": {\n" +
            "\"rel\": \"self\",\n" +
            "\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD\", \"name\": \"Account\"\n" +
            "},\n" +
            "\"Name\": \"AccountExample\",\n" +
            "\"Id\": \"88-4XVPD\",\n" +
            "\"Location\": \"Albany\",\n" +
            "\"Primary Organization Id\": \"1SIA-7SY3\",\n" +
            "\"Primary Organization\": \"Medical Products MD ENU\"\n" +
            "} }";

    public static final String Contact = "{\n" +
            "\"items\": {\n" +
            "\"Link\": {\n" +
            "\"rel\": \"self\",\n" +
            "\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD\", \"name\": \"Account\"\n" +
            "},\n" +
            "\"Id\": \"88-4XVPD\" }\n" +
            "}";

    public static final String Contact884W6YS = "{\n" +
            "\"items\": {\n" +
            "\"Link\": {\n" +
            "\"rel\": \"self\",\n" +
            "\"href\": \"http://ServerName:port/siebel-rest/v1.0/data/Account/Account/88-4XVPD\", \"name\": \"Account\"\n" +
            "},\n" +
            "\"Id\": \"88-4XVPD\" }\n" +
            "}";

    public static final String QueryByExample = "{\n" +
            "\"items\": {\n" +
            "\t\"Business Address\": {\n" +
            "\t\t\"Address Id\": \"1-6NMY+C\",\n" +
            "\t\t\"Street Address\": \"2000 West Embarcadero Rd\", \"Address Integration Id\": \"\",\n" +
            "\t\t\"County\": \"\",\n" +
            "\t\t\"Street Address 2\": \"\",\n" +
            "\t\t\"City\": \"Palo Alto\",\n" +
            "\t\t\"State\": \"CA\",\n" +
            "\t\t\"Country\": \"USA\",\n" +
            "\t\t\"Postal Code\": \"94510\",\n" +
            "\t\t\"Province\": \"\",\n" +
            "\t\t\"IsPrimaryMVG\": \"Y\"\n" +
            "\t\t},\n" +
            "    \"Related Sales Rep\": [\n" +
            "    {\n" +
            "\t\t\"IsPrimaryMVG\": \"Y\",\n" +
            "\t\t\"Division\": \"IF 20 Commercial Banking\",\n" +
            "\t\t\"Position Id\": \"1-1JD\",\n" +
            "\t\t\"Position\": \"IF 20 33 Relationship Manager\",\n" +
            "\t\t\"Position Integration Id\": \"\",\n" +
            "\t\t\"Login\": \"FINADMIN\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\"IsPrimaryMVG\": \"N\",\n" +
            "\t\"Division\": \"Siebel Administration\", \"Position Id\": \"0-5220\",\n" +
            "\t\"Position\": \"Siebel Administrator\", \"Position Integration Id\": \"\", \"Login\": \"SADMIN\"\n" +
            "\t}\n" +
            "    ],\n" +
            "    \"Related Contact\": [\n" +
            "    {\n" +
            "\t\"Contact Id\": \"88-23SUX\",\n" +
            "\t\"First Name\": \"Selfservice\",\n" +
            "\t\"Contact Integration Id\": \"\",\n" +
            "\t\"Middle Name\": \"\",\n" +
            "\t\"Last Name\": \"Merchant\",\n" +
            "\t\"Primary Organization\": \"Comms-Media Default Organization (COM ENU)\",\n" +
            "\t\"Person UId\": \"88-23SUX\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\"Contact Id\": \"1-6S9M\",\n" +
            "\t\"First Name\": \"Avo\",\n" +
            "\t\"Contact Integration Id\": \"\",\n" +
            "\t\"Middle Name\": \"\",\n" +
            "\t\"Last Name\": \"Sarkissian\",\n" +
            "\t\"Primary Organization\": \"Default Organization\",\n" +
            "\t\"Person UId\": \"1-6S9M\"\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\"Contact Id\": \"1-BAEL\",\n" +
            "\t\"First Name\": \"Todd\",\n" +
            "\t\"Contact Integration Id\": \"\",\n" +
            "\t\"Middle Name\": \"\",\n" +
            "\t\"Last Name\": \"What\",\n" +
            "\t\"Primary Organization\": \"Default Organization\",\n" +
            "\t\"Person UId\": \"1-BAEL\"\n" +
            "\t},\n" +
            "\t{ \n" +
            "\t\"Contact Id\": \"1-BAER\", \n" +
            "\t\"First Name\": \"Walter\", \n" +
            "\t\"Contact Integration Id\": \"\", \n" +
            "\t\"Middle Name\": \"\",\n" +
            "\t\"Last Name\": \"What\",\n" +
            "\t\"Primary Organization\": \"Default Organization\", \n" +
            "\t\"Person UId\": \"1-BAER\"\n" +
            "\t}\n" +
            "\t],\n" +
            "\t\"Related Organization\": {\n" +
            "\t\"IsPrimaryMVG\": \"Y\",\n" +
            "\t\"Organization\": \"Millennium Institutional Finance Services IF ENU\", \"Organization Id\": \"1-1DG\",\n" +
            "\t\"Organization Integration Id\": \"\"\n" +
            "\t},\n" +
            "\t\"Account Id\": \"1-63Q9\",\n" +
            "\t\"Account Status\": \"Active\",\n" +
            "\t\"Parent Account Integration Id\": \"\",\n" +
            "\t\"Number of Employees\": \"0\",\n" +
            "\t\"PO Auto Approval Date\": \"\",\n" +
            "\t\"Name\": \"3Com\",\n" +
            "\t\"PO Approved Flag\": \"\",\n" +
            "\t\"Integration Id\": \"\",\n" +
            "\t\"VAT registration number\": \"\",\n" +
            "\t\"Assignment Country Code\": \"\",\n" +
            "\t\"Parent Account Id\": \"\",\n" +
            "\t\"Skip Credit Check\": \"N\",\n" +
            "\t\"Price List\": \"\",\n" +
            "\t\"Price List Id\": \"\",\n" +
            "\t\"Price List Integration Id\": \"\",\n" +
            "\t\"PO Auto Approval Limit\": \"\",\n" +
            "\t\"Main Fax Number\": \"6505551212\",\n" +
            "\t\"Assignment Area Code\": \"\",\n" +
            "\t\"Alias\": \"\",\n" +
            "\t\"Competitor Flag\": \"N\",\n" +
            "\t\"Global Ultimate DUNS\": \"\",\n" +
            "\t\"PO Auto Approval Currency Code\": \"\",\n" +
            "\t\"Parent HQ DUNS\": \"\",\n" +
            "\t\"Parent Account Location\": \"\",\n" +
            "\t\"DUNS Number\": \"\",\n" +
            "\t\"Credit Auto Approval Limit\": \"0\",\n" +
            "\t\"Main Phone Number\": \"6505551212\",\n" +
            "\t\"Parent Account Name\": \"\",\n" +
            "\t\"Location\": \"HQ-Distribution\",\n" +
            "\t\"Expertise\": \"\",\n" +
            "\t\"Primary Organization\": \"Millennium Institutional Finance Services IF ENU\",\n" +
            "\t\"Type\": \"Customer\",\n" +
            "\t\"Home Page\": \"3COM.com\", \"Domestic Ultimate DUNS\": \"\", \"Credit Status Date\": \"\", \"Currency Code\": \"USD\", \"Partner Flag\": \"N\"\n" +
            "\t} \n" +
            "}\n";


    public static final String bodyWriteRecord = "{\n" +
            "  \"Name\":\"WriteRecord\"\n" +
            "}";

    public static final String bodyPutSISAccountListApplet_1 = "{\n" +
            "    \"Name\": \"SIS Account List Applet_1\",\n" +
            "    \"UpgradeBehavior\": \"Preserve\",\n" +
            "    \"Comments\": \"New Record_Applet\",\n" +
            "    \"ProjectName\": \"VERT CUT Common\"\n" +
            "}";

    public static final String bodyPutAccount884XVPD = "{\n" +
            "\"Name\": \"AccountExample\",\n" +
            "\"Primary Organization Id\": \"1SIA-7SY3\",\n" +
            "\"Primary Organization\": \"Medical Products MD ENU\", \"Location\": \"Albany\",\n" +
            "\"Description\": \"AccountData\"\n" +
            "}";

    public static final String bodyAccount = "{\n" +
            "\"Name\": \"AccountExample\",\n" +
            "\"Primary Organization\": \"Medical Products MD ENU\",\n" +
            "\"Location\": \"Albany\",\n" +
            "\"Primary Organization Id\": \"1SIA-7SY3\"\n" +
            "}";

    public static final String bodyContact = "{\n" +
            "\"Bill To First Name\":\"Siebel\",\n" +
            "\"Bill To Last Name\": \"Customer\",\n" +
            "\"Person UId\":\"0CR-1MF5Z6d11\",\n" +
            "\"Primary Organization\":\"Default Organization\", \"Personal Contact\":\"N\"\n" +
            "}";

    public static final String bodyContact884W6YS = "{\n" +
            "    \"Primary Account Name\": \"DemoAccount1303\",\n" +
            "    \"Personal Contact\": \"N\",\n" +
            "    \"Account Integration Id\": \"\",\n" +
            "    \"Id\": \"88-4W6YS\",\n" +
            "    \"Bill To Last Name\": \"Customer\",\n" +
            "    \"Person UId\": \"0CR-1MF5Z6d11\",\n" +
            "    \"Bill To First Name\": \"Siebel\",\n" +
            "    \"Employee Number\": \"88-4W6YS\",\n" +
            "    \"Primary Organization\": \"Default Organization\",\n " +
            "   \"Bill To Job Title\": \"VP\"\n" +
            "}";

    public static final String bodyQueryByExample = "{ \"body\":{\n" +
            "    \"StartRowNum\": \"0\",\n" +
            "      \"SiebelMessage\":{\n" +
            "        \"MessageId\":\"\",\n" +
            "        \"MessageType\":\"Integration Object\",\n" +
            "        \"IntObjectName\":\"Account Interface\",\n" +
            "        \"IntObjectFormat\":\"Siebel Hierarchical\",\n" +
            "        \"ListOfAccount Interface\":{\n" +
            "        \"Account\":{\"Name\": \"3Com\" }\n" +
            "} }\n" +
            "} }";

    public static final String bodyWriteRecordLonger = "{\n" +
            "    \"Name\": \"WriteRecord\",\n" +
            "    \"Comments\": \"New Record_Applet\",\n" +
            "    \"ProjectName\": \"VERT CUT Common\"\n" +
            "}";

    public static final String bodySynchronizeUser = "{ \"body\":\n" +
            "    {\n" +
            "      \"Employee\":\n" +
            "{\n" +
            "\"Login Name\": \"Cathy.Rogers\", \"Field 1\": \"Value 1\",\n" +
            "\"Field 2\": \"Value 2\"\n" +
            "} }\n" +
            "}";

    public static final String bodyCreateUser = "{ \"body\":\n" +
            "    {\n" +
            "      \"Employee\":\n" +
            "      {\n" +
            "        \"First Name\": \"Cathy\",\n" +
            "        \"Last Name\": \"Rogers\",\n" +
            "        \"Login Name\":\"Cathy.Rogers\",\n" +
            "        \"EMail Addr\":\"Cathy.Rogers@oracle.com\"\n" +
            "      },\n" +
            "      \"ListOfPosition\":\n" +
            "      {\n" +
            "            \"Position\":\n" +
            "            {\n" +
            "              \"Name\":\"Cathy.Rogers\",\n" +
            "              \"Division\":\"Default Organization\"\n" +
            "            }\n" +
            "      },\n" +
            "      \"ListOfEmployee_Responsibility\":\n" +
            "      {\n" +
            "        \"Employee_Responsibility\":\n" +
            "        {\n" +
            "          \"Responsibility\":\"Clinical Research Associate\"\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "}";

    public static final String bodyTerminateUser = "{ \"body\":\n" +
            "{ \"Employee\":\n" +
            "{\n" +
            "\"Login Name\":\"Cathy.Rogers\"\n" +
            "} }\n" +
            "}";

    public Boolean isEqualsJSON(String locJSONString, String inpJSONString){

        JsonObject jsonLocObject = new JsonParser().parse(locJSONString).getAsJsonObject();
        JsonObject jsonInpObject = new JsonParser().parse(inpJSONString).getAsJsonObject();

        // for test/debag purposes
//        System.out.println(jsonLocObject.equals(jsonInpObject));
//        System.out.println(jsonInpObject);
//        System.out.println(jsonLocObject);

        return jsonLocObject.equals(jsonInpObject);
    }
}
