/**
 * 
 */
var contextRoot = "/" + window.location.pathname.split('/')[1];

function checkinCall(id) {
	$
			.ajax({
				type : 'POST',
				url : contextRoot + '/checkin',
				dataType : "json", // Accepts
				data : 'id='+id, // sending form data into json
				contentType : 'application/json', // Sends
				success : function(result) {

					// alert(result.firstName);
					$('#formInput').html("");
					$("#formInput")
							.append(
									'<H3 align="center"> New Employee Information <H3>');
					$('#formInput').append(
							"<H4 align='center'>First Name:  "
									+ result.firstName + "</h4>");
					$('#formInput').append(
							"<H4 align='center'>Last Name: " + result.lastName
									+ "</h4>");
					$('#formInput').append(
							"<H4 align='center'>Email: " + result.email
									+ "</h4>");
					$("#formInput")
							.append(
									'<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
					make_visible('formInput');
					make_hidden('errors');
				},

				error : function(errorObject) {

					if (errorObject.responseJSON.errorType == "ValidationError") {
						$('#errors').html("");
						$("#errors").append(
								'<H3 align="center"> Error(s)!! <H3>');
						$("#result").append('<p>');

						var errorList = errorObject.responseJSON.errors;
						$.each(errorList, function(i, error) {
							$("#errors").append(error.message + '<br>');
						});
						$("#errors").append('</p>');

					}

					else {
						alert(errorObject.responseJSON.errors(0)); // "non"
						// Validation
						// Error
					}

					make_visible('errors');

				}

			});
}