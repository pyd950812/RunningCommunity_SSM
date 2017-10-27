

function commit() {
	var icon=$("#icon").val();
	$("#mylife").val(icon);

	if(icon!=null){
		ajaxFileUpload();
	}
	return true;
}


function ajaxFileUpload(){
	$.ajaxFileUpload(
		{
			url: 'AjaxUploadController/test',
			secureuri: false,
			async: false,
			fileElementId: 'myfile',
			dataType: 'text'
			
		});
}	
