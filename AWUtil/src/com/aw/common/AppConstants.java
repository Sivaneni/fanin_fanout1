/*
 * Created on Aug 29, 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.aw.common;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class AppConstants {
    // IME : Added the following auto-schedule status constants which can have the following 3 states
    // SUCCESS : Attempted auto-schedule and successfully placed on a delivery
    // FAILURE : Attempted auto-schedule but failed validation
    // NOT APPLICABLE : Did not attempt to auto-schedule (i.e. a manual/uploaded order, not an OE Order, etc.)
    public interface AUTO_SCHEDULE_STATUS {
        public static final String FAILURE = "Failure";
        public static final String NOT_APPLICABLE = "Not Applicable";
        public static final String SUCCESS = "Success";
    }
    public interface BACKORDER_STATUS {
        public static final String CANCELLED = "Cancelled";
        public static final String CREATED = "Created";
        public static final String UPDATED = "Updated";
    }
    public interface CACHEMAPKEYS {
        public interface CREATE_ORDER {
            public static final String ADDED_PO = "poNumber";
            public static final String BUILDORDER_ACTIVE_DIV_STATE = "buildOrderActiveState";
            public static final String BUILDORDER_ACTIVE_PANEL = "buildOrderActivePanel";
            public static final String LINE_ATTACHMENT_MAP = "lineAttachmentMap";
            public static final String ORDER_BEAN_STATE = "orderBeanState";
            public static final String ORDER_ID = "orderIdForCreate";
        }
        public interface INITIAL_QUALITY {
            public static final String CACHEDMAP_IQORDER_REQUEST_SAVED_KEY = "CM_IQORDER_REQUEST_SKEY";
        }
        public interface MANAGE_DELIVERY {
            public static final String CACHEDMAP_MANAGE_DELIVERY_CRITERIA_KEY = "cachedmapManageDeliverykey";
            public static final String CLEACH_SEARCH = "ClearSearch";
            public static final String DELIVERY_ID = "deliveryID";
            public static final String DISTRIBUTOR_ID = "distributorID";
            public static final String EDIT_DELIVERY = "QTCEditManageDelivery";
            // source of the delivery data. values can be any value from the DELIVERY_SOURCE constants
            public static final String INFORMATION_SOURCE = "informationSource";
            public static final String PREVIOUS_PAGE = "previousPage";
            public static final String REHEDULE_DELIVERY = "QTCRescheduleDelivery";
            public static final String SHIPMENT_ID = "shipmentID";
            public static final String SHIPMENT = "shipment";
            public static final String SHOW_DELIVERY_LIST = "showDeliveryList";
            public static final String SPLIT_ID = "splitID";
            public static final String SPLIT_NUMBER = "splitNumber";
        }
        public interface MANAGE_PREFERENCES {
            public static final String DEALER_ID = "dealerId";
            public static final String DLR_PREFERENCES = "dlrPreferences";
        }
        public interface ORDER_LIST {
            public static final String CACHEDMAP_ORDER_ACTIVEPANEL_KEY = "cachedmapActivePanelkey";
            public static final String CACHEDMAP_ORDER_ACTIVEPANEL_KEY_TABBED = "cachedmapActivePanelTabbedkey";
            // IME : ADDED FOR USE IN THE NEW ORDER SEARCH IMPLEMENTATION
            public static final String CACHEDMAP_ORDER_SEARCH_CRITERIA = "cachedmapOrderSearchCriteria";
            public static final String CACHEDMAP_ORDERSEARCH_BKO_KEY = "cachedmapBKOkey";
            public static final String CACHEDMAP_ORDERSEARCH_PENDING_KEY = "cachedmapPendingkey";
            public static final String CACHEDMAP_ORDERSEARCH_SAVED_KEY = "cachedmapSavedkey";
        }
        public interface SPR_LIST {
            public static final String CACHEDMAP_SELECTED_SPR_HEADER = "selectedSPR";
            public static final String CACHEDMAP_SPR_SEARCH_BEAN = "cachedmapSPRSearchBean";
        }
        public interface PART_LIST {
            public static final String CACHEDMAP_PARTSEARCH_KEY = "cachedmappartsearchkey";
            public static final String CACHEDMAP_PARTSEARCHRESULTS_KEY = "cachedmappartsearchresultskey";
        }
        public interface PROFILE_KEYS {
            public static final String DEALER_TIERING_PROTECTED_LINKS_KEY = "dealerTieringAllowedPageNames";
            public static final String EMAIL = "email";
            public static final String FIRST_NAME = "firstName";
            public static final String LAST_NAME = "lastName";
            public static final String ROLES = "roles";
            public static final String USER_PROFILE = "userProfile";
            public static final String USER_UI_CONTEXT = "userUiContext";
        }
        public interface SESSION_KEYS {
            public static final String CONCURRENT_EXCEPTION = "showConcurrentException";
            public static final String INVALID_PART_IN_ORDER = "invalidPartInOrder";
            public static final String INVALID_PART_IN_SCHEDULED_ORDER = "invalidPartInScheduledOrder";
            public static final String INVALID_PART_LOCATION = "invalidPartLocation";
            public static final String AUTO_SCHEDULE_ERROR = "autoScheduleError";
        }
        public static final String CAN_CREATE_ORDER = "canCreateOrders";
        public static final String ORDER_BEAN = "orderBean";
    }
    public interface COMPARE_PROPERTIES {
        public static final String COMBINED_PROPS = "combinedProps";
        public static final String EDIT_ALL_LINES = "editAllLines";
        public static final String EDIT_LINE = "editLine";
        public static final String EDIT_ORDER_PORTLET = "editOrder";
        public static final String MANUAL_PROCESSING_PORTLET = "manualProcessing";// same as all props but also has record create and update
        public static final String ALL_PROPS = "allProps";// any props that can change from edit order or manual pros
    }
    public interface COUNTRY {
        public static final String CANADACODE = "CAN";
        public static final String MEXICOCODE = "MEX";
        public static final String UNITEDSTATESCODE = "USA";
    }
    public interface CREDIT_HOLD_EMAIL_MESSAGE {
        public static final String CH_BLOCK_TYPE = "Block Type:";
        public static final String CH_CUSTOMER_NAME = "Customer Name:";
        public static final String CH_DATE_ORDERED = "Date Ordered:";
        public static final String CH_DISTRIBUTOR = "Distributor:";
        public static final String CH_NET_AMOUNT = "Estimated Net Amount of Order:";
        public static final String CH_ORDER_NUMBER = "Order Number:";
        public static final String CH_SUBJECT = "Order credit alert";
        public static final String CH_SUBMITTED_BY = "Order Submitted By:";
    }
    public interface CUSTOMER_TYPE {
        public static final String Dealer = "Dealer";
        public static final String DISTRIBUTOR = "Distributor";
        public static final String HOME_DEPOT = "Home Depot";
        public static final String HOME_DEPOT_TYPE_ID = "4";
        public static final String THIRD_PARTY_LOGISTICS = "Third Party Logistics";
        public static final String THIRD_PARTY_LOGISTICS_TYPE_ID = "3";
        public static final String DISTRIBUTOR_ID = "1";
        public static final String DEALER_ID = "2";
    }
    public interface DATABASE {
        public interface EVENT {
            public static final int DELETE = 3;
            public static final int INSERT = 1;
            public static final int UPDATE = 2;
        }
    }
    public interface DEALER_SEARCH_MODE {
        public static final String CREATE_INITIAL_QUALITY = "createInitialQuality";
        public static final String DELIVERY = "delivery";
        public static final String DELIVERY_CREATE = "deliveryCreate";
        public static final String DELIVERY_DETAIL = "deliveryDetail";
        public static final String DELIVERY_RESCHEDULE = "deliveryReschedule";
        public static final String ORDER_EDIT = "edit";
        public static final String ORDER_SEARCH = "search";
        public static final String SEARCH_INITIAL_QUALITY = "searchInitialQuality";
        public static final String SPR_EDIT = "sprEdit";
        public static final String SPR_SEARCH = "sprSearch";
        public static final String VIEW_INITIAL_QUALITY = "viewInitialQuality";
    }
    public interface THD_VIEW_ORDER_MODE {
        public static final String SERVICE_ORDER = "serviceOrder";
    }
    public interface DELIVERY_SOURCE_ID {
        public static final String OE = "7";
    }
    public interface DELIVERY_SPLIT_STATUS {
        public static final String CLOSED = "Closed";
        public static final long CLOSED_ID = 4;
        public static final String DELETED = "Deleted";
        public static final long DELETED_ID = 2;
        public static final String OPEN = "Open";
        public static final long OPEN_ID = 1;
        public static final String SHIPPED = "Shipped";
        public static final long SHIPPED_ID = 5;
        public static final String WITHIN_LEAD_TIME = "Within Lead Time";
        public static final long WITHIN_LEAD_TIME_ID = 3;
    }
    public interface DOP_CALENDAR {
        public static final String AW_LOAD_DATE_COLUMN_NUMBER = "awLoadDateColumnNumber";
        public static final String DATA_ROW_END = "dataRowEnd";
        public static final String DATA_ROW_START = "dataRowStart";
        public static final String ETA_DAYS1_COLUMN_NUMBER = "etaDays1ColumnNumber";
        public static final String ETA_DAYS2_COLUMN_NUMBER = "etaDays2ColumnNumber";
        public static final String ETA_DAYS3_COLUMN_NUMBER = "etaDays3ColumnNumber";
        public static final String ETA_DAYS4_COLUMN_NUMBER = "etaDays4ColumnNumber";
        public static final String ETA_DAYS5_COLUMN_NUMBER = "etaDays5ColumnNumber";
        public static final String ETA_DAYS6_COLUMN_NUMBER = "etaDays6ColumnNumber";
        public static final String ETA_DAYS7_COLUMN_NUMBER = "etaDays7ColumnNumber";
        public static final String ETA_DAYS8_COLUMN_NUMBER = "etaDays8ColumnNumber";
        public static final String GENERAL_CATEGORY = "General";
        public static final String NUMBER_OF_ETA_DAYS_TO_LOAD = "numberOfETADaysToLoad";
        public static final String SHEET_NAME = "tabName";
        public static final String VAN_COMMIT_DATE_COLUM_NNUMBER = "vanCommitDateColumnNumber";
    }
    public interface EZ_ORDER_AUTHORIZATION {
        public static final String CREATE = "AWeZ Create";
        public static final String ORDER_CAPTURE = "Order Capture";
        public static final String VIEW = "AWeZ View";
    }
    public interface FILE_TYPE {
        public static final String DC = "DC";
        public static final String IQ = "IQ";
        public static final String UI = "UI";
    }
    public interface HTTP_REQUEST_HEADER {
        public static final String EMAIL = "email";
        public static final String FIRST_NAME = "firstName";
        public static final String LAST_NAME = "lastName";
        public static final String MEMBER_OF = "memberOf";
        public static final String SM_USER = "SM_USER";
    }
    public interface LENGTH_VALIDATION {
    	public static final String EXCEEDS_LENGTH = "Warning - [1] field is too long. ([2] Char. Max)";
    }
    public interface MAIL {
        public static final String FROM_ADDRESS = "andersenaccessdonotreply@andersencorp.com";
    }
    public interface MIME_TYPE {
        public static final String PDF = "application/pdf";
    }
    public interface NOTE {
        public interface AUTO_SCHEDULE_MESSAGE {
            public static final String CREDIT_HOLD = "This order requires additional review - before it will be acknowledged.";
            public static final String CUSTOMER_ID_MISMATCH = "The Customer ID on the Order and on the Shipment do not match: ";
            public static final String DELETED_SHIPMENT = "Shipment has been deleted - ID: ";
            public static final String DISTID_MISMATCH = "Service Order - Dist Id on the Order does not match Shipment Distributor ID: ";
            public static final String DISTRIBUTOR_ID_MISMATCH = "The Distributor ID on the Order and on the Shipment do not match: ";
            public static final String DUPLICATE_PO = "Duplicate PO Number: ";
            public static final String EXPRESS_SHIPMENT = "Shipment is AW Express - ID: [0]";
            public static final String INSUFFICIENT_CAPACITY = "Insufficient Load Capacity on Shipment: ";
            public static final String INVALID_SERVICE_ORDER_ADDRESS = "The Address for the service order is not valid";
            public static final String LEAD_TIME_VIOLATIONS = "Order Line(s) violate lead time, unable to put on Delivery: ";
            public static final String MIXED_OE_ORDER_TYPE_FOR_ISS_DISTRIBUTOR = "ISS Distributor Shipments must contain only orders with the same OE Order Type.  ";
            public static final String MIXED_PRODUCT_ORDER = "Mixed 100 Series Product Order";
            public static final String MIXED_VAS_FLAG_FOR_ISS_DISTRIBUTOR = "ISS Distributor Shipments must contain only orders with the same VAS flag.  ";
            public static final String NO_AVAILABLE_TO_SHIP_DATE = "No Available To Ship Date for Order: ";
            public static final String NO_REQUESTED_DELIVERY = "No Requested Delivery Number specified for PO: ";
            public static final String NO_SHIPMENT_EXISTS = "No Shipment Exists for Shipment ID: ";
            public static final String NO_SPLIT_EXISTS = "No Split Exists for Shipment ID: ";
            public static final String NON_MATCHING_PMAS = "PMA on order does not match PMA on shipment.";
            public static final String ONE_HUNDRED_SERIES_NOT_AUTO_SCHEDULEABLE = "100 Series Products cannot be auto scheduled, when submitted from OTT or iQ";
            public static final String ORDER_LINE_HAS_EXCEPTIONS = "Order Line has exceptions";
            public static final String ORDER_LINE_NOT_READY = "Order Line not ready: ";
            public static final String ORDER_LINE_CANNOT_BE_AUTOSCHEDULED = "Order Line: [0] is in a status of [1] which cannot be auto-scheduled.";
            public static final String ORDER_LINE_NOT_STANDARD = "Order Line is a non-standard item on a Service Order";
            public static final String ORDER_LINE_HAS_PRICE_DISCREPANCY = "Price Discrepancy due to Estimated Net Price: [0] is not within Tolerance: (Low: [1] | High: [2]) of Customer PO Cost: [3])";
            public static final String SERVICE_ORDER = "Service Order - Distributor ID: ";
            public static final String SHIPPED_SHIPMENT = "Shipment has shipped - ID: ";
            public static final String WAVEPLANNED_SHIPMENT = "Shipment has been wave planned in WMS - ID: ";
            public static final String UNKNOWN_SHIPMENT_STATUS = "Shipment: [0] has an unknown delivery status: [1]";
            public static final String INELIGIBLE_PROMOTION_ON_LINES = "One or more order lines are not eligible for Promotion Code: [0].";
        }
        public interface CODE {
            public static final String NO_VALID_LEAD_TIME = "EXPT022";
            public static final String NO_WC_LINE_FOUND = "EXPT024";
            public static final String NOT_A_RECOGNIZED_PART = "EXPT021";
            public static final String ORDER_LINE_HAS_EXCEPTIONS = "EXPT023";
            public static final String QUANTITY_MUST_BE_MULTIPLE = "EXPT025";
            public static final String DISTRIBUTOR_APPLIED_MULLS = "EXPT033";
            public static final String DISTRIBUTOR_APPLIED_EJS = "EXPT034";
            // Promotion code processing constructs Notes via the NoteRank table
            public static final String PROMOTION_INVALID_FOR_DEALER = "EXPT036";
            public static final String PROMOTION_INVALID_FOR_DISTRIBUTOR = "EXPT037";
            public static final String PROMOTION_NOT_EFFECTIVE = "EXPT038";
            public static final String PROMOTION_EXPIRED = "EXPT039";
            public static final String PROMOTION_MINIMUM_AMOUNT_NOT_MET = "EXPT040";
            public static final String PROMOTION_MAXIMUM_EXCEEDED = "EXPT041";
            public static final String PROMOTION_MANUAL_REVIEW_REQUIRED = "EXPT042";
            public static final String PROMOTION_INVALID_NOT_FOUND = "EXPT043";
            public static final String PROMOTION_NO_ELIGIBLE_LINES = "EXPT044";
            public static final String PROMOTION_INVALID_FOR_ALI_DISTRIBUTOR = "EXPT045";
        }

        public interface CUSTOMER_ADDRESS_VALIDATION {
            public static final String INCOMPLETE_ADDRESS = "Customer Address is incomplete.";
        }
        public interface EXCEPTION {
            public static final String EXCEPTION = "exception";
            public static final String INTERNAL_MESSAGE = "internalMessage";
            public static final String MANUAL = "manual";
            public static final String MIXED_PRODUCT = "MixedProducts";
            public static final String NO_LEAD_TIME = "NoLeadTime";
            public static final String USER_CREATED = "userCreated";
            public static final String AUTO = "auto";
            public static final String PST = "pst";
        }
        public interface EXCEPTION_MESSAGE {
            public static final String UNAUTHORIZED_PART = "The distributor for this order is not authorized to order this part.";
        }
        public interface IQ_ORDER_SUBMIT_VALIDATION {
            public static final String CUSTOMER_NOT_ALLOWED_TO_SUBMIT_ORDER = "Customer not authorized to submit orders from IQ: ";
            public static final String CUSTOMER_NOT_AUTHORIZED_TO_AUTO_SCHEDULE_ORDER = "Customer not authorized to auto-schedule orders submitted from IQ: ";
            public static final String DUPLICATE_PO = "Purchase order [0] is a duplicate for customer [1].";
            public static final String DUPLICATE_PO_VALIDATION_ERROR = "Duplicate PO Number validation failed due to error: ";
            public static final String INACTIVE_CUSTOMER = "ORDER IS NOT CREATED - DEALER IS INACTIVE";
            public static final String OTT_ORDER_SAVE_FAILED = "Unable to create entry in OTT for Order: [0] in OTT due to following error: Code: [1] Message: [2]. Note: The order was created in Andersen Access, but was not Auto-scheduled.";
            public static final String OTT_PO_HEADER_SAVE_FAILED = "Unable to create entry in OTT for PO Header: [0] due to following error: Code: [1] Message: [2]. Note: The PO Header was created in Andersen Access, but no order was created.";
            public static final String OTT_UNAVAILABLE_ORDER_SAVE_ERROR = "Unable to create entry in OTT due to potential connectivity issue. Note: The Order: [0] was created in Andersen Access, but was not Auto-scheduled.";
            public static final String OTT_UNAVAILABLE_PO_SAVE_ERROR = "Unable to create entry in OTT due to potential connectivity issue. Note: The PO Header: [0] for PO Number: [1] was created in Andersen Access, but no order was created.";
        }
        public interface EDI_VALIDATION {
            public static final String UPLOAD_FAILED_HEADER = AppConstants.R1_Constants.NEWLINE + "EDI Order Upload Failed due to the following: " + AppConstants.R1_Constants.NEWLINE + AppConstants.R1_Constants.NEWLINE;
            public static final String ORDER_LINE_HEADER = AppConstants.R1_Constants.NEWLINE + "  Order Line: [0], Part #: [1]" + AppConstants.R1_Constants.NEWLINE + AppConstants.R1_Constants.NEWLINE;
            public static final String MISSING_REQUIRED_ORDER_TAG = "    Missing Required XML Order Tag: [0]" + AppConstants.R1_Constants.NEWLINE;
            public static final String MISSING_REQUIRED_ORDER_LINE_TAG = "    Missing Required XML Order Line Tag: [0]" + AppConstants.R1_Constants.NEWLINE;
        }
    }
    public interface NOTE_USER_ACTION {
        public static final String IGNORE_NOTE = "I";
    }
    public interface ORDER {
        public interface LINE_SOURCE {
            public static final String CUSTOM = "CUSTOM";
            public static final String DC = "DC";
            public static final String IQ_DEALER_XML = "IQ DEALER XML";
            public static final String OE_XML = "OE XML";
            // AB:Modified as in database
            public static final String PART_SEARCH_BY_PN = "PART SEARCH";
            public static final String PART_SEARCH_BY_SPEC = "PART SEARCH BY SPEC";
            public static final String PARTS = "PARTS";
            public static final String WC_XML = "WC XML";
        }
        public interface OTT {
            public static final String STATUS_COMPLETE = "Complete";
            public static final String STATUS_ERROR = "Error";
            public static final String DELAYED = "Delayed";
            public static final String XPATH_OTTPARENTID = "//" + ORDER.TAG_OTTPARENTID;
        }
        public interface EDI {
            public static final String XPATH_EDI_FLAG = "//Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER.TAG_EDIFLAG.toUpperCase() + "']";
            public static final String XPATH_THD_PO_CREATE_DATE = "//Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER.TAG_THD_PO_CREATE_DATE.toUpperCase() + "']";
            public static final String XPATH_THD_DELIVERY_DATE = "//Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER.TAG_THD_DELIVERY_DATE.toUpperCase() + "']";
            public static final String XPATH_THD_STORE_NAME = "//Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER.TAG_THD_STORE_NAME.toUpperCase() + "']";
            public static final String XPATH_THD_VENDOR_NUMBER = "//Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER.TAG_THD_VENDOR_NUMBER.toUpperCase() + "']";
            public static final String XPATH_PART_NUMBER = "./Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER_LINE.TAG_PART_NUMBER.toUpperCase() + "']";
            public static final String XPATH_SKU = "./Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER_LINE.TAG_SKU.toUpperCase() + "']";
            public static final String XPATH_SKU_DESCRIPTION = "./Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER_LINE.TAG_SKU_DESCRIPTION.toUpperCase() + "']";
            public static final String XPATH_THD_PO_LINE_NUMBER = "./Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER_LINE.TAG_THD_PO_LINE_NUMBER.toUpperCase() + "']";
            public static final String XPATH_THD_PO_COST = "./Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER_LINE.TAG_THD_PO_COST.toUpperCase() + "']";
            public static final String XPATH_THD_UNIT_OF_MEASURE = "./Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + ORDER_LINE.TAG_THD_UNIT_OF_MEASURE.toUpperCase() + "']";
        }
        /**
         * Name of attribute in XML file which holds the Submit To Order Delivery Receipt Email.
         */
        public static String TAG_DELIVERY_RECEIPT_EMAIL = "DeliveryReceiptEmail";
        /**
         * Name of attribute in XML file which holds the sender's email address.
         */
        public static String TAG_EMAIL = "email";
        /**
         * Name of attribute in XML file which holds the IQ Version.
         */
        public static String TAG_IQVERSION = "IQVersion";
        /**
         * Name of element in XML file which holds the TAG_IQVERSION attribute. This must be in the proper case (NAME is different from Name, which is different from name)
         */
        public static String TAG_NAME = "Name";
        /**
         * Name of attribute in XML file which holds the IQ Version.
         */
        public static final String TAG_OTTPARENTID = "ott_parentorderid";
        public static final String TAG_EDIFLAG = "ediflag";
        public static final String TAG_THD_PO_CREATE_DATE = "THDPOCreateDate";
        public static final String TAG_THD_DELIVERY_DATE = "THDDeliveryDate";
        public static final String TAG_THD_STORE_NAME = "THDStoreName";
        public static final String TAG_THD_VENDOR_NUMBER = "THDVendorNbr";
        // XPath expression to retrieve the email for an xml order file
        public static final String XPATH_EMAIL = "//" + ORDER.TAG_EMAIL;
        // XPath expression to retrieve the IQ Version for an xml file
        public static final String XPATH_IQVERSION = "//Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + TAG_IQVERSION.toUpperCase() + "']";
        // XPath expression to retrieve additional submit to order email for an xml order file
        public static final String XPATH_SUBMIT_TO_ORDER_DELIVERY_EMAIL = "//Attribute[translate(@" + TAG_NAME + ", 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')='" + TAG_DELIVERY_RECEIPT_EMAIL.toUpperCase() + "']";
    }
    public interface ORDER_CHARGE_TYPE {
        public static final String CANCELLATION_CHARGE = "Cancellation Charge";
        public static final String CANCELLATION_WAIVER = "Cancellation Waiver";
        public static final String LATE_ADD_CHARGE = "Late Add Charge";
        public static final String LATE_ADD_WAIVER = "Late Add Waiver";
    }
    public interface ORDER_LINE {
        public interface DISTRIBUTOR {
            public static String ALI_DISTRIBUTOR_NAME = "Company Owned";
        }
        public interface FACTORY {
            public static final String BYPASS_EXCEPTION = "exception";
        }
        public interface PRODUCT_LINE {
            public static String ONE_HUNDRED_SERIES = "100 Series";
            public static String FLX = "flx";
        }
        public interface WAREHOUSE {
            public interface COREPRODUCT {
                public static final String BPFG01 = "BPFG01";
                public static final String CCFG01 = "CCFG01";
            }
            public interface DASHWOOD {
                public static final String DSHFG1 = "DSHFG1";
            }
            public interface SALESMRKT {
                public static final String SLSMKT = "SLSMKT";
            }
        }
        public static final String BYPASS_CODES_IGNORED_ON_SERVICE_ORDERS = "B,D,J";
        public static final int MULTISITE_LENGTH = 16;
        public static final int PART_NUMBERED_LENGTH = 7;
        public static final String TAG_PART_NUMBER = "PART_NUMBER";
        public static final String TAG_SKU = "SKU";
        public static final String TAG_SKU_DESCRIPTION = "SKUDescription";
        public static final String TAG_THD_PO_LINE_NUMBER = "THDPOLineNbr";
        public static final String TAG_THD_PO_COST = "THDPOCost";
        public static final String TAG_THD_UNIT_OF_MEASURE = "THDUnitOfMeasure";
    }
    public interface ORDER_NAVIGATION {
        public static final String ALL_ORDERS_BKO_KEY = "allBKO";
        public static final String ALL_ORDERS_CANCELLED_KEY = "allCancelled";
        public static final String ALL_ORDERS_PENDING_KEY = "allPending";
        public static final String ALL_ORDERS_PREFERENCE_KEY = "allPreference";
        public static final String ALL_ORDERS_SAVE_KEY = "allSave";
        public static final String ALL_ORDERS_SCHEDULED_KEY = "allScheduled";
    }
    public interface ORDER_SEARCH {
        public static final String AA_SEARCH_MODE = "AA";
        public static final String CUSTOMER_TYPE_THD_ID = "4";
        public static final String CUSTOMER_TYPE_THIRD_PARTY_ID = "3";
        public static final String PORTLET_PREFERENCE_SEARCH_MODE = "SEARCH_MODE";
        public static final String THD_SEARCH_MODE = "THD";
    }
    public interface ORDER_STATUS {
        public static final String ACCESSORY_TO_PICK = "AccessoryPickup";
        public static final String ACKNOWLEDGED = "Acknowledged";
        public static final String ACTIVE = "Active";
        public static final String AWAITINGCSRPROCESSING = "AwaitingCSRProcessing";
        public static final String AWAITINGSPLPROCESSING = "AwaitingSpecialProcessing";
        public static final String BACKORDERED = "Backordered";
        public static final String BLUESHEET = "Bluesheet";
        public static final String CANCELLED = "Cancelled";
        public static final String DELETED = "Deleted";
        public static final String INVOICED = "Invoiced";
        public static final String LINEUP = "Lineup";
        public static final String MERGED = "Merged";
        public static final String OPEN = "Open";
        public static final String PENDING = "Pending";
        public static final String PENDINGACK = "PendingAck";
        public static final String POTENTIAL_BACKORDER = "Potential Backorder"; // TODO used?
        public static final String POTENTIAL_BO = "PotentialBackorder";
        public static final String READT_TO_SCHEDULE = "ReadyToSchedule";
        public static final String REASSIGNED = "Reassigned";
        public static final String RESOLVED = "Resolve/Reject";
        public static final String SAVED = "Saved";
        public static final String SCHEDULED = "Scheduled";
        public static final String SHIPPED_INCOMPLETE = "Shipped Incomplete";
        public static final String SENT_TO_VENDOR = "SentToVendor";
        public static final String SHIPMENTINPROGRESS = "ShipmentInProgress";
        public static final String SHIPPED = "Shipped";
        public static final String SHIPPING_INCOMPLETE = "ShippedIncomplete";
        public static final String STAGED = "Staged";
        public static final String WAVEPLANNED = "WavePlanned";
        public static final String WBI_ACCESSORY_PICK = "Accessory Picked";
        public static final String WBI_BLUESHEET = "Bluesheet";
        public static final String WBI_INVOICED = "Invoiced";
        public static final String WBI_LINEUP = "LineupComplete";
        public static final String WBI_POTENTIAL_BACKORDER = "Potential BO";
        public static final String WBI_SENT_TO_VENDOR = "Sent to Vendor";
        public static final String WBI_SHIPMENT_IN_PROCESS = "Shipping in Progress";
        public static final String WBI_SHIPPED = "Shipped";
        public static final String WBI_STAGED = "Staged";
        public static final String INTEGRATION_WAVEPLANNED = "Planned";
        public static final String INTEGRATION_CLEARWAVEPLANNED = "Unplanned";
    }
    public interface ORDER_TYPE {
        public static final String AWEXPRESS = "AW Express";
        public static final String AWEXPRESS_CODE = "L";
        public static final String AWEXPRESS_ID = "2";
        public static final String AWVAN = "AW Van";
        public static final String AWVAN_CODE = "V";
        public static final String AWVAN_ID = "1";
        public static final String CROSSDOCK_ID = "3";
        public static final String DC_EXPRESS_CODE = "LCL";
        public static final String DC_VAN_CODE = "RMT";
        public static final String DIRECT_ID = "5";
        public static final String JOB_SITE_LIVE_UNLOAD = "Job Site Live Unload";
        public static final String JOB_SITE_WITH_STORAGE = "Job Site with Storage";
        public static final String OE_EXPRESS_CODE = "D";
        public static final String OE_WAREHOUSE_CODE = "W";
        public static final String OE_X_DOCK_CODE = "X";
        public static final String THD_STOCK_ID = "7";
        public static final String THD_HOME_DELIVERY = "THD Home Delivery";
        public static final Integer THD_HOME_DELIVERY_ID = Integer.valueOf(6); // using ID define to eliminate service call for desc
        public static final String THD_ID = "6";
        public static final String WAREHOUSE_ID = "4";
    }
    public interface ORDER_TYPE_DISPLAY_THD {
        public static final String THD_SPECIAL = "Special";
        public static final String THD_STOCK = "Stock";
    }
    public interface OTT_EMAIL_MESSAGE {
        public static final String OTT_BODY = "OTT [0] failed for OTT Tracking ID [1] due to the following problem: \n\n\n Error Code: [2] \n\n Error Text: [3]";
        public static final String OTT_SUBJECT = "OTT [0] failed for OTT Tracking ID ";
    }
    public interface PARAMETERS {
        public static final String REFRESH = "refresh";
        public static final String REFRESH_WAS = "refreshWASConfig";
        public static final String REFRESH_CONFIGURATION_VALUES = "refreshConfigurationValues";
    }
    public interface PART_SEARCH_MODE {
        public static final String BUILD_ORDERS = "buildOrders";
    }
    public interface PROCESSING_STATE {
        public static final String AUTO_SCHEDULE = "auto";
        public static final String EXCEPTION = "exception";
        public static final String READY = "ready";
        public static final String USER_CREATED = "userCreated";
    }
    public interface QTCAPPCONFIG {
        public interface CUSTFORMS_CATEGORY_PROPERTY {
            public static final String AOC_SPR = "AOCSPR";
            public static final String CASEMENT = "Casement";
            public static final String CASING = "Casing";
            public static final String DIRECT_GLAZED = "DirectGlazed";
            public static final String MISCELLANEOUS_PARTS = "MiscellaneousParts";
            public static final String MONUMENTAL_DOUBLE_HUNG = "MonumentalDoubleHung";
            public static final String SPR_MId_ATLANTIC = "SPRMidAtlantic";
            public static final String SPR_NORTHEAST_ART_GLASS = "SPRNortheastArtGlass";
            public static final String THERMA_TRU_TRANSOM = "ThermaTruTransom";
        }
        public interface CUT_OFF_TIME_PROPERTY {
            public static final String AW_EXPRESS = "AWEXPRESS";
            public static final String AW_VAN = "AWVAN";
        }
        public interface DELIVERY_SOURCE {
            public static final String BAAN = "BAAN";
            public static final String EZORDER = "EZORDER";
            public static final String OLOS = "OLOS";
            public static final String ORCA = "ORCA";
        }
        public interface DELIVERY_SPLIT {
            public static final String TOTAL_NO_OF_SPLIT = "TotalNoOfSplit";
        }
        public interface INVITE_A_COLLEGEUE {
            public static final String CONTENT_KEY = "content";
            public static final String INVITE_A_COLLEGUE_KEY = "InviteACollegue";
            public static final String TITLE_KEY = "title";
        }
        // URL of webAPP servlet to access files atored in database
        public interface RESOURCE_INVOKER_SERVLET {
            public static final String SERVLET_URL = "SERVLET_URL";
        }
        public static final String CUSTFORMS_CATEGORY_KEY = "CUSTFORMS";
        public static final String CUT_OFF_TIME_KEY = "CutOffTime";
        public static final String DELIVERY_SPLIT_KEY = "DELIVERY_SPLIT";
        public static final String DLR_CREDIT_HOLD_STATUS = "DLR_CREDIT_HOLD_STATUS";
        public static final String EZORDER = "eZOrder";
        public static final String GENERAL_CATEGORY_KEY = "General";
        public static final String LOAD_SPRING_CONFIG = "LoadSpringConfig";
        public static final String MAIL_DEBUG_PROP_KEY = "mail.debug";
        public static final String ORDER_TYPE_CATEGORY_KEY = "ORDERTYPE";
        public static final String RESOURCE_INVOKER_CATEGORY_KEY = "Resource_Invoker_Servlet";
        public static final String SET_DEFAULT_PROFILE = "SetDefaultProfile";
        public static final String SMTP_HOST_PROP_KEY = "mail.smtp.host";
        public static final String SPRING_CONFIG_FILES = "SpringConfigFiles";
        public static final String WS_SPRING_CONFIG_FILES = "WS_SpringConfigFiles";
        public static final String SPRING_DATASOURCE_FILENAME_KEY = "SpringDataSourceConfig";
        public static final int STANDARD_PRODUCT_LEAD_TIME = 10;
        public static final String START_TRANS_AGENT = "StartTransactionAgent";
        public static final String STATES = "States";
    }
    public interface QTCCONFIG {
        public static final String APP_CONFIG_FILENAME = "AppConfig.xml";
        public static final String DOP_CALENDAR_CONFIG_FILENAME = "DOPFileConfig.xml";
        public static final String SPRING_CONFIG_FILENAME = "SpringConfig.xml";
    }
    public interface R1_Constants {
        public static final String ACTIVE = "A";
        public static final String ADD = "ADD";
        public static final String AMPERSAND = "&";
        public static final String APOSTROPHE = "`";
        // WAS Environment Variable declarations
        // These can be found in the admin console here : Application servers > server1 > Process Definition > Java Virtual Machine > Custom Properties
        public static final String APP_ENVIRONMENT_VARIABLE = "aw.app.env";
        public static final String ASTERISK = "*";
        public static final String AT = "@";
        public static final String BACK_SLASH = "\\";
        public static final String BACKSLASH = "\\";
        public static final String BLANK = "";
        public static final String BREAK = "<br>";
        public static final String CARET = "^";
        public static final String CENTS = ".00";
        public static final String CLOSE_BRACE = "]";
        public static final String CLOSE_BRACKET = "}";
        public static final String CLOSE_PAREN = ")";
        public static final String COLON = ":";
        public static final String COMMA = ",";
        public static final String CR = "\r";
        public static final String DASH = "-";
        public static final String DEV_ENVIRONMENT = "DEV";
        public static final String DEVINT_ENVIRONMENT = "DEVINT";
        public static final String DISPLAY_DATE_FORMAT = "MM/dd/yyyy";
        public static final String DOLLAR = "$";
        public static final String DOLLAR_SIGN = "$";
        public static final String DOUBLE_QUOTE = "\"";
        public static final String EQUALS = "=";
        public static final String EXCLAMATION = "!";
        public static final String F = "F";
        public static final String FALSE = "false";
        public static final String FORWARD_SLASH = "/";
        public static final String GREATER_THAN = ">";
        public static final String HTTP = "http";
        public static final String HTTP_PREFIX = HTTP + "://";
        public static final String HTTPS_PREFIX = HTTP + "s://";
        public static final String INACTIVE = "I";
        public static final String LESS_THAN = "<";
        public static final String LOCAL_ENVIRONMENT = "LOCAL";
        public static final String LOG_DIRECTORY_ENVIRONMENT_VARIABLE = "aw.app.logdir";
        public static final String MINUS = "-";
        public static final String N = "N";
        public static final String NEWLINE = "\n";
        public static final String NO = "No";
        public static final String NONE = "None";
        public static final String ONE = "1";
        public static final String OPEN_BRACE = "[";
        public static final String OPEN_BRACKET = "{";
        public static final String OPEN_PAREN = "(";
        public static final String PERCENT = "%";
        public static final String PERIOD = ".";
        public static final String PIPE = "|";
        public static final String PLUS = "+";
        public static final String POUND = "#";
        public static final String PROD_ENVIRONMENT = "PROD";
        public static final String QTC_LOGLEVEL_ENVIRONMENT_VARIABLE = "aw.app.qtc.loglevel";
        public static final String QUESTION_MARK = "?";
        public static final String QUOTE = "'";
        public static final String RESET = "RESET";
        public static final String SEMICOLON = ";";
        public static final String SINGLE_TICK = "`";
        public static final String SLASH = "/";
        public static final String SPACE = " ";
        public static final String STAGING_ENVIRONMENT = "STAGE";
        public static final String SUBMIT = "SUBMIT";
        public static final String T = "T";
        public static final String TAB = "\t";
        public static final String TEXT_PLAIN = "text/plain";
        // Content Type constant declarations
        public static final String TEXT_XML = "text/xml";
        public static final String TILDE = "~";
        public static final String TRAN_LOGLEVEL_ENVIRONMENT_VARIABLE = "aw.app.tran.loglevel";
        public static final String TRUE = "true";
        public static final String UNAVAILABLE = "Unavailable";
        public static final String UNDERSCORE = "_";
        public static final String Y = "Y";
        public static final String YES = "Yes";
        public static final String ZERO = "0";
        public static final String EMAIL_LINE_BREAK = AppConstants.R1_Constants.CR + AppConstants.R1_Constants.NEWLINE + AppConstants.R1_Constants.CR + AppConstants.R1_Constants.NEWLINE;
    }
    public interface RESOURCE_SERVLET {
        public interface DOCUMENT_SOURCE {
            public static final String FILE_SERVER = "FS";
            public static final String INITIAL_QUALITY = "IQ";
            public static final String ORDER = "ORDER";
        }
    }
    public interface SERVICE {
        public interface CANCEL {
            public static final String LINESTATUS = "cancelled";
        }
        public interface ORDER_TYPE {
            public static final String BKO = "BKO";
            public static final String CANCELLED = "CANCELLED";
            public static final String CRITERIA = "CRITERIA";
            public static final String PENDING = "PENDING";
            public static final String SAVED = "SAVED";
            public static final String SCHEDULED = "SCHEDULED";
        }
        public interface RESULT {
            public static final int FAILURE = 0;
            public static final int SUCCESS = 1;
        }
    }
    public interface SHIPMENT_MODE {
        public static final long NEXT_DAY_ID = 1;
        public static final long STANDARD_ID = 4;
    }
    public interface SHIPMENT_TYPE {
        public static final String AW_EXPRESS = "AW Express";
        public static final String AW_VAN = "AW Van";
        public static final String AW_VAN_ID = "1";
        public static final String JOB_SITE_LIVE_UNLOAD = "Job Site Live Unload";
        public static final String JOB_SITE_LIVE_UNLOAD_ID = "4";
        public static final String JOB_SITE_WITH_STORAGE = "Job Site with Storage";
        public static final String JOB_SITE_WITH_STORAGE_ID = "3";
        public static final String THD_HOME_DELIVERY = "THD Home Delivery";
        public static final String THD_HOME_DELIVERY_ID = "6";
        public static final String THD_AA_ORDER_SHIP_FROM = "Menomonie, WI";
    }
    public interface SORTING {
        public static final int COMPARISON_AFTER = 1;
        // Comparison related constants
        public static final int COMPARISON_BEFORE = -1;
        public static final int COMPARISON_EQUAL = 0;
    }
    public interface SOURCE_SYSTEM {
        public static final String AMERICAN_CRAFTSMAN = "InfoFlo";
        public static final String ANDERSEN_ACCESS = "AWeZ";
        public static final String ANDERSEN_WINDOWS = "AW";
        public static final String BAAN = "BAAN";
        public static final String CP = "CP";
        public static final String CP_ID = "12";
        public static final String EMCO = "BPCS";
        public static final String EV = "EV";
        public static final String EV_ID = "13";
        public static final String IQ = "iQ";
        public static final String IQ_ORDER_SUBMIT = "IQ_ORDER_SUBMIT";
        public static final String IQ_ORDER_SUBMIT_ID = "11";
        public static final String OE = "OE";
        public static final String ORCA = "ORCA";
        public static final String OTT = "OTT";
        public static final String WC = "WC";
    }
    public interface EDI_870 {
        public static final String EDI870 = "870";
    }
    public interface TAB_PANEL {
        public interface CREATE_ORDER_HEADER_TAB {
            public static final String CREATE_PANEL = "orderPanel";
            public static final String REVIEW_PANEL = "reviewPanel";
            public static final String SCHEDULE_PANEL = "deliveryPanel";
        }
        public interface CREATE_ORDER_LINE_TAB {
            public static final String DISCREPANCY_PANEL = "discrepancyTab";
            public static final String EXCEPTION_PANEL = "exceptionTab";
            public static final String READY_TO_SCHEDULE_PANEL = "readyToScheduleTab";
        }
    }
    public interface UPLOAD_HANDLER {
        public static final String AUTO_CREATE_SHIPMENT_TAG = "//auto_create_shipment";
        public static final String FAILURE = "FAILURE";
        public static final String FILE_TEMPLATE = "c:\\[0].xml";
        public static final String HEX_UTF8_CHARACTER_REPLACEMENT_EXPRESSION = "^([\\W]+)<";
        public static final String NEXT = "Next";
        public static final String ORDER_DAO = "orderDAO";
        public static final String SHIPMENT_MODE_TAG = "//shipment_mode";
        public static final String SOURCE_SYSTEM_TAG = "//SOURCESYSTEM";
        public static final String UTF8 = "UTF-8";
        public static final String WCSHIPPING_TAG = "//WCShipping";
        public static final String WC_ADDRESS1_TAG = WCSHIPPING_TAG + "//Address1";
        public static final String WC_ADDRESS2_TAG = WCSHIPPING_TAG + "//Address2";
        public static final String WC_CITY_TAG = WCSHIPPING_TAG + "//City";
        public static final String WC_CONTACT_NAME_TAG = WCSHIPPING_TAG + "//ContactName";
        public static final String WC_CONTACT_PHONE_TAG = WCSHIPPING_TAG + "//ContactPhone";
        public static final String WC_COUNTRY_TAG = WCSHIPPING_TAG + "//Country";
        public static final String WC_CUSTOMER_NAME_TAG = WCSHIPPING_TAG + "//CustomerName";
        public static final String WC_STATE_TAG = WCSHIPPING_TAG + "//State";
        public static final String WC_ZIPCODE_TAG = WCSHIPPING_TAG + "//ZipCode";
        public static final String WINDOWCARE_TAG = "//windowcare";
        public static final String KML_CANADA_FLAG = "//KML_CAN_Flag";
    }
    public interface UI {
        public static final String SUCCESS = "success";
        public static final String FAILURE = "failure";
        public interface PAGE {
            public static final int SEARCH_RESULT_PAGE_SIZE = 10;
        }
    }
    public interface URLS {
        public static final String CREATE_ORDER_PAGE = "/wps/myportal/CreateOrder";
        public static final String DEALER_SELECTION_PAGE = "/wps/myportal/SelectLocation";
        public static final String EDIT_ORDER_PAGE = "/wps/myportal/EditOrder";
        public static final String HOME_PAGE = "/wps/myportal/HomePage";
        public static final String IQ_CREATE_REQUEST_PAGE = "/wps/myportal/IQCreateRequest";
        public static final String IQ_LOCATE_ORDER_PAGE = "/wps/myportal/IQLocateOrder";
        public static final String IQ_VIEW_REQUEST_PAGE = "/wps/myportal/IQViewRequest";
        public static final String MANAGE_DELIVERY_CREATE = "/wps/myportal/CreateDelivery";
        public static final String MANAGE_DELIVERY_DETAILS = "/wps/myportal/DeliveryDetails";
        public static final String MANAGE_DELIVERY_LIST = "/wps/myportal/DeliveryList";
        public static final String MANAGE_DELIVERY_LIST_EDIT = "/wps/myportal/EditDelivery";
        public static final String MANAGE_DELIVERY_LIST_RESCHEDULE_ORDER = "/wps/myportal/RescheduleDelivery";
        public static final String MANAGE_DELIVERY_PAGE = "/wps/myportal/DeliveryDetails";
        public static final String MANUAL_PROCESS_PAGE = "/wps/myportal/ManualProcess";
        public static final String ORDER_DETAILS_MANAGE_DELIVERY_PAGE = "/wps/myportal/ViewOrderDetailsManageDelivery";
        public static final String ORDER_DETAILS_PAGE = "/wps/myportal/ViewOrderDetails";
        public static final String ORDER_SEARCH_PAGE = "/wps/myportal/OrderSearch";
        public static final String PART_LIST_FOR_ORDER_PAGE = "/wps/myportal/PartListForOrder";
        public static final String PARTS_PAGE = "/wps/myportal/PartListForOrder";
        public static final String PARTS_PAGE_ADD_COMPONENTS = "/wps/myportal/PartListForAddingComponents";
        public static final String PARTS_PAGE_MANUAL_PROCESS = "/wps/myportal/PartListForManualProcess";
        public static final String PROMOTION_CODE_MAINT = "/wps/myportal/PromoCodeMaintenance";
        public static final String VIEW_ORDER_HISTORY = "/wps/myportal/ViewOrderHistory";
        public static final String SERVICE_ORDER_LIST = "/wps/myportal/THDServiceRequestList";
        public static final String SERVICE_ORDER_DETAILS = "/wps/myportal/THDViewServiceOrderDetails";
        public static final String SPR_EDIT = "/wps/myportal/CreateSPR";
        public static final String SPR_SEARCH = "/wps/myportal/SearchSPR";
    }
    public interface USER {
        public static final String IQ_SYSTEM_USER = "iq9999";
        public static final String SYSTEM_USER = "9999";
    }
    public interface WBI_VERBS {
        public static final String CREATE_VERB = "Create";
        public static final String DELETE_VERB = "Delete";
        public static final String SYNC_VERB = "Sync";
        public static final String UPDATE_VERB = "Update";
    }
    public interface WC_EMAIL_MESSAGE {
        public static final String WC_BODY = "The WindowCare WCPartOrderStatusUpdate web service was not able to update part order [0] due to the following problem: \n\n\n Error Code: [1] \n\n Error Text: [2] \n\n\n The service orders team should correct the order in AWeZ as appropriate and update the WindowCare part order if necessary. \n\n\n No action is necessary for the AWeZ support team.";
        public static final String WC_SUBJECT = "WC WCPartOrderStatusUpdate web service not able to update part order ";
    }
    // PvB : 1.26.10 Jtrac 2177 Added the following windowcare order update status, This will be used for the return values
    // that are sent to windowcare via the web service.
    public interface WC_ORDER_UPDATE_STATUS {
        public static final String AUTO_FAILURE = "Not Scheduled";
        public static final String AUTO_SUCCESS = "Scheduled";
        public static final String NOT_APPLICABLE = "Not Applicable";
    }
    public interface WORKGROUP_NAMES {
        public static final String AW_CORE = "AW CORE";
        public static final String DEFAULT_ROUTING_AW_CORE = "1";
        public static final String ORDER_OWNERSHIP_SCHEDULE = "ORDER OWNERSHIP & SCHEDULE";
    }
    public interface WS_FAILURE_EMAIL_MESSAGE {
        public static final String WS_BODY = "The AWParser Web Service is not available or has experienced a failure being called from portal, please contact a developer to investigate.";
        public static final String WS_SUBJECT = "Upload Web Service Failure ";
    }
    public interface DATASOURCE {
        public static final String WINDOWCARE_XML_ID = "9";
        public static final String OE_XML_ID = "7";
    }
    public static final String DATE_FORMAT = "MM/dd/yyyy";
    public static final String DELIVERY_MODE_CREATE = "DeliveryCreate";
    public static final String DLR_CREDIT_HOLD_STATUS = "Finance (AR)";
    public static DecimalFormat doublePriceFormat = new DecimalFormat("######.00");
    public static final int EST_STORAGE_DURATION_VALUE = 14;
    public static final String HTTP_REQUEST_HEADER_MEMBER_OF_DELIMITER = ",";
    public static final int LAST_4_MONTHS = -120;
    public static final int LAST_MONTH = -30;
    public static final int LAST_SIXMONTH = -180;
    public static final int LAST_WEEK = -7;
    public static final int LAST_YEAR = -365;
    public static DecimalFormat loadFactorFormat = new DecimalFormat("0.000");
    public static final int NEXT_2_WEEKS = 14;
    public static final int NEXT_3_MONTHS = 90;
    public static final int NEXT_MONTH = 30;
    public static final String DROPPED_TO_WMS = "Dropped";
    public static final String WMS_WAVEPLANNED = "Wave Planned";
    public static final String ORDER_HEADER_ID_DEFAULT = "Unassigned";
    public static final String ORDER_HEADER_STATUS_DEFAULT = "Unsaved";
    public static final Map<String, String[]> ORDER_LINE_CHANGEABLE_PROPS;
    public static final Map<String, String> MES_LOCATION_DISPLAY;
    public static final String PART_ID_PARAM = "partid";
    public static final String PART_SEARCH_PARAM_VALUE = "Search";
    public static DecimalFormat priceFormat = new DecimalFormat("#,###.00");
    public static final String REFRESH_RESULTS_PARAM_NAME = "refreshResults";
    public static final String RESET_ORDER_PARAM_NAME = "resetOrder";
    public static final String RESET_VIEW_PARAM_NAME = "reset";
    public static final String SEARCH_PART_NUMBER_PARAM = "search_part_number";
    public static final String SELECT = "Select";
    public static final String SHIPMENT_TIMEZONE_FORMAT = "MM/dd/yy hh:mm aaa";
    public static DecimalFormat stdPkgQtyFormat = new DecimalFormat("0");
    public static DecimalFormat tenthFormat = new DecimalFormat("#,###.0");
    public static final String TIME_ZONE = "CST";
    public static final String USER_PROFILE = "userProfile";
    public static final Double ZERO_VALUE = new Double("0.00");
    static {
        Map<String, String[]> properties = new HashMap<String, String[]>();
        properties.put(COMPARE_PROPERTIES.EDIT_ORDER_PORTLET, new String[] { "quantityOrdered", "roomLocation", "iqLineNumber", "referenceNumber", "lineStatusId", "price", "processingState","processingDueDate" });
        properties.put(COMPARE_PROPERTIES.EDIT_LINE, new String[] { "priceCodeId", "chargeToBaanCompany", "account", "costCenter", "sprNumber", "quoteNumber", "windowcareLineNumber", "roomLocation", "lineStatusId", "price", "processingState" });
        properties.put(COMPARE_PROPERTIES.EDIT_ALL_LINES, new String[] { "priceCodeId", "chargeToBaanCompany", "account", "costCenter", "lineStatusId", "price" });
     // IME : AA-4278 : 05/29/2013 | Added iqLineNumber to the fields on Manual Processing, which required I had to add it to the following list.        
        properties.put(COMPARE_PROPERTIES.MANUAL_PROCESSING_PORTLET, new String[] { "priceCodeId", "chargeToBaanCompany", "account", "costCenter", "sprNumber", "quoteNumber", "iqLineNumber", "windowcareLineNumber", "roomLocation", "quantityOrdered", "lineStatusId", "processingState", "ediInsufficientInfoCode", "frontOfficeDescription" });
        // IME : AA-2847 : Added the following to the COMBINED_PROPS and ALL_PROPS LIST: cadDrawingFlag, frontOfficeItemSize, fxNumber, genericPart, itemCost, loadFactor, orderCharges, productLeadTime, weight
        properties.put(COMPARE_PROPERTIES.COMBINED_PROPS, new String[] { "priceCodeId", "chargeToBaanCompany", "account", "costCenter", "sprNumber", "quoteNumber", "windowcareLineNumber", "roomLocation", "quantityOrdered", "recordUpdateDate", "recordCreateDate", "iqLineNumber", "referenceNumber", "lineStatusId", "price", "cadDrawingFlag", "itemCommonSize", "fxNumber", "genericPart", "itemCost", "loadFactor", "orderCharges", "productLeadTime", "weight" });
        properties.put(COMPARE_PROPERTIES.ALL_PROPS, new String[] { "priceCodeId", "chargeToBaanCompany", "account", "costCenter", "sprNumber", "quoteNumber", "windowcareLineNumber", "roomLocation", "quantityOrdered", "iqLineNumber", "referenceNumber", "lineStatusId", "price", "cadDrawingFlag", "itemCommonSize", "fxNumber", "genericPart", "itemCost", "loadFactor", "orderCharges", "productLeadTime", "weight" });
        ORDER_LINE_CHANGEABLE_PROPS = Collections.unmodifiableMap(properties);
        Map<String, String> mesLocations = new HashMap<String, String>();
        mesLocations.put("BP", "MES-Bayport");
        mesLocations.put("MEN", "MES-Menomonie");
        MES_LOCATION_DISPLAY = Collections.unmodifiableMap(mesLocations);
    }
    public interface HISTORY_CONSTANTS {
        public static final String VIEW_ORDER_HISTORY_EVENT_TARGET = "QTCViewOrderHistoryPortlet";
        public static final String ORDER_LINE_ID_EVENT_TYPE = "OrderLine_Id";
        public static final String ORDER_HEADER_ID_EVENT_TYPE = "Order_Header_Id";
        public static final String ORDER_LINE_ID_PARAMETER = "orderLineId";
        public static final String ORDER_HEADER_ID_PARAMETER = "orderHeaderId";
        public static final String IS_ARCHIVED_ORDER_PARAMETER = "isArchivedOrder";
    }
    public interface WAS_INSTANCE {
    	static final String WAS_INSTANCE_BINDING = "aw/config/TRANSACTION_PROCESSOR_WAS_INSTANCE";
    }
}
