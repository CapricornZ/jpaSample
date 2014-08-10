/**
 *
 */
package com.shanghaionstar.mag.domain;

/**
 * @author Andy
 *
 */
public enum ServiceType {
	RPOValidate,
	UserLogin,
	SendRegcode,
    ActivateDevice,
    RenewToken,
    PinAuth,
    QueryAccount,
    ChangeAccount,
    GetContentList,
    GetContentDetail,
    CheckAppVersion,
    DeleteFavoriteDestination,
    GetFavoriteDestinationList,
    GetPackageList,
    AddFavoriteDestination,
    SendToVehicleHistory,
    SearchHistory,
    SearchNearbyDestination,
    SearchDestinationByName,
    ReverseGeocode,
    SendEula,
    Report,
    ShareDestination,
    GetDestinationByLink,
    GetDestinationByApp,  
    //yiruiYuan 20131203
    RegisterVisitorToSubscriber, RegisterToVisitor, RegisterToSubscriber, ForgetPassword,
    ProcessSubscriberInfo, ChangePassword, GetCommunicationTime, GetVehicleList,GetPreferredDealer,ProcessPreferredDealer,GetDealers,saveInvoice,queryOrderInfoById,
    queryOrderDetailedInfoById,queryOrderHistory,bid,getAvailablePkgs,
    PayMe,PrepaidCard,getAccountInfoByVin,activatePrepaidCard,validatePrepaidCard,
}
