/**
 * 
 * @returns
 */

function createAjaxRequest(){
	alert("createAjaxReq");
	var ajaxRequest;  // The variable that makes Ajax possible!

	try{
		// Opera 8.0+, Firefox, Safari
		ajaxRequest = new XMLHttpRequest();
	} catch (e){
		// Internet Explorer Browsers
		try{
			ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try{
				ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e){
				// Something went wrong
				alert("Your browser broke!");
				return false;
			}
		}
	}
	
	return ajaxRequest;

}

function updatePage(ajaxRequest) {
	alert("updatePage");
	alert(ajaxRequest.readyState);
	if (ajaxRequest.readyState == 4) {
		var response = ajaxRequest.responseText;
		alert(response);
		return response;
	}	
}

function callServer() {
	alert("callServer");
	var ajaxRequest = createAjaxRequest();
	
	
	//get info from web form
	var user = document.getElementById("userName").value;
	var pass = document.getElementById("password").value;

	// Build the URL to connect to
	var url = "MainServlet?userName=" + escape(user) + "&password=" + escape(pass);
	alert(url);

	// Open a connection to the server
	ajaxRequest.open("GET", url, true);

	// Setup a function for the server to run when it's done
	ajaxRequest.onreadystatechange = updatePage(ajaxRequest);
	
	alert("going to send");
	// Send the request
	ajaxRequest.send(null);
	




}
