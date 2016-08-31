/**
 * 
 */
var contextRoot = "/" + window.location.pathname.split('/')[1];

function checkinCall(id) {
	alert(contextRoot+ "/checkin?id=" + id);
	$.ajax({
		type : 'GET',
		url : contextRoot + '/checkin',
		dataType : "json", // Accepts
		data : 'id='+ id, // sending form data into json
		contentType : 'application/json', // Sends
		success : function(result) {

		},

		error : function(errorObject) {

			if (errorObject.responseJSON.errorType == "ValidationError") {

			}

			else {
				alert(errorObject.responseJSON.errors(0)); // "non"

			}

			make_visible('errors');

		}

	});
}