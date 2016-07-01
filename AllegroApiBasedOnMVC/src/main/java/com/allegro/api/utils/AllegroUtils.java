package com.allegro.api.utils;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import SandboxWebApi.DoGetMySellItemsRequest;
import SandboxWebApi.DoGetMySellItemsResponse;
import SandboxWebApi.DoGetMyWatchItemsRequest;
import SandboxWebApi.DoGetMyWatchItemsResponse;
import SandboxWebApi.DoLoginRequest;
import SandboxWebApi.DoLoginResponse;
import SandboxWebApi.DoQueryAllSysStatusRequest;
import SandboxWebApi.DoQueryAllSysStatusResponse;
import SandboxWebApi.SellItemStruct;
import SandboxWebApi.ServicePortProxy;
import SandboxWebApi.SysStatusType;
import SandboxWebApi.WatchItemStruct;

public class AllegroUtils {
	
	public List<String> itemThumbnailUrls = new ArrayList<String>();
	private static final String WEB_API_KEY = "sb555bd6";

	public List<String> getItemThumbnailUrl() {
		
		ServicePortProxy client = new ServicePortProxy();
		DoQueryAllSysStatusRequest sysStatusRequest = new DoQueryAllSysStatusRequest();
		sysStatusRequest.setCountryId(1);
		sysStatusRequest.setWebapiKey(WEB_API_KEY);
		
		try {
			
			DoQueryAllSysStatusResponse sysStatusResponse = client.doQueryAllSysStatus(sysStatusRequest);
			SysStatusType[] sysStatusTypeList = sysStatusResponse.getSysCountryStatus();
			SysStatusType sysStatusType = sysStatusTypeList[0];
			
			DoLoginRequest params = new DoLoginRequest("Client:29407123","b555bd6feb3e05d2", 1, WEB_API_KEY,sysStatusType.getVerKey());
			
			DoLoginResponse resp = client.doLogin(params);
			
			System.out.println("RESPONSE: " + resp.getServerTime());
			
			DoGetMyWatchItemsRequest myWatchItemsResquest = new DoGetMyWatchItemsRequest();
			myWatchItemsResquest.setSessionId(resp.getSessionHandlePart());
			DoGetMyWatchItemsResponse myWatchItemsResponse = client.doGetMyWatchItems(myWatchItemsResquest);
			System.out.println("MYWATCHITEMS: " + myWatchItemsResponse.getWatchItemsCounter());
			
			WatchItemStruct[] watchItemStruct = myWatchItemsResponse.getWatchItemsList();
			
			for(int i=0; i<watchItemStruct.length; i++)
			{
				String itemTh = watchItemStruct[i].getItemThumbnailUrl();
				System.out.println("STRUCT: " + itemTh);
				if (itemTh != null && !"".equals(itemTh))
				{
					itemThumbnailUrls.add(itemTh);
				}
			}
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return itemThumbnailUrls;
	}
	
	public List<String> getMySellingThumbnailsUrls(){
		
		ServicePortProxy client = new ServicePortProxy();
		DoQueryAllSysStatusRequest sysStatusRequest = new DoQueryAllSysStatusRequest();
		sysStatusRequest.setCountryId(1);
		sysStatusRequest.setWebapiKey(WEB_API_KEY);
		
		try {
			
			DoQueryAllSysStatusResponse sysStatusResponse = client.doQueryAllSysStatus(sysStatusRequest);
			SysStatusType[] sysStatusTypeList = sysStatusResponse.getSysCountryStatus();
			SysStatusType sysStatusType = sysStatusTypeList[0];
			
			DoLoginRequest params = new DoLoginRequest("Client:29407123","b555bd6feb3e05d2", 1, WEB_API_KEY,sysStatusType.getVerKey());
			
			DoLoginResponse resp = client.doLogin(params);
			
			DoGetMySellItemsRequest mySellItemsRequest = new DoGetMySellItemsRequest();
			mySellItemsRequest.setSessionId(resp.getSessionHandlePart());
			DoGetMySellItemsResponse mySellItemResponse = client.doGetMySellItems(mySellItemsRequest);
			System.out.println("My Sellin items count: " + mySellItemResponse.getSellItemsCounter());
			
			SellItemStruct[] sellItemStruct = mySellItemResponse.getSellItemsList();
			//WatchItemStruct[] watchItemStruct = myWatchItemsResponse.getWatchItemsList();
			
			for(int i=0; i<sellItemStruct.length; i++)
			{
				String itemTh = sellItemStruct[i].getItemThumbnailUrl();
				System.out.println("Sell Thumb Url: " + itemTh);
				if (itemTh != null && !"".equals(itemTh))
				{
					itemThumbnailUrls.add(itemTh);
				}
			}
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return itemThumbnailUrls;
	}
}
