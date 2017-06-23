
$(document).ready(function(){
	
	var allSemestersText = "";
	
	var allTimeslots = [];
	var singleElements = [];
	
	var semesterID = 0;
	var timeID = 0;
	var fullTableID = "";
	
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/BachelorIMI1.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveFirstData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/BachelorIMI2.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/BachelorIMI3.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/BachelorIMI4.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/BachelorIMI5.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/BachelorIMI6.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/MasterIMI1.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/MasterIMI2.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/MasterIMI3.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data);},
	});
	$.ajax({
		type: "GET",
		url: "/ZhangProjectBackend/resources/MasterIMI4.csv",
		dataType: "text",
		contentType:"text/plain",
		success: function(data) {saveData(data); processData(data);},
	});
		
	
	
	function saveFirstData (allTextOfOneSemester) {
		allSemestersText = allSemestersText + allTextOfOneSemester;
	}
	
	function saveData (allTextOfOneSemester) {
		allSemestersText = allSemestersText + " ; " + allTextOfOneSemester;
	}
	
	function processData() {
		
//		console.log(allSemestersText);
		
//		var allTextLines = allText.split(/\r\n|\n/);		
		allTimeslots = allSemestersText.split(/[\n;]/);
				
//		for (var i = 0; i < allTimeslots.length; i++) {
//			console.log(allTimeslots[i]);
//		}
		
//		
//		for (var i = 0; i < allTextLines.length-1; i++) {
//			allTimeslots.push(allTextLines[i].split(';'));
//			
//		}
//		for (var i = 0; i < allTimeslots.length; i++) {
//			singleElements.push(allTimeslots[i].split(','))
//		}
		
		
		for (var i = 0; i < allTimeslots.length; i++) {	
			
			fullTableID = "table-cell-" + i;
						
			if (!((allTimeslots[i] == "")||(allTimeslots[i] == "-")||(allTimeslots[i] == " ")||(allTimeslots[i] == " -")||(allTimeslots[i] == "- "))) {
				
//				console.log(allTimeslots[i]);

				
				document.getElementById(fullTableID).innerHTML = allTimeslots[i];
				
				
				
//				document.getElementById(fullTableID).innerHTML = "Kurs: " + kurs + ", Dozent: " + dozent + ", Raum: " + raum;
			}
		}
	}
});


