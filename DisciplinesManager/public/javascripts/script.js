$(document).ready(function(){
	alert("desgraça.com");
	$('div.disciplina').Sortable({
				onChange 		: function(){	    			 

					serialEsq = $.SortSerialize('c1');

					serialDir = $.SortSerialize('c2');


				},

				onStart : function(){
					$.iAutoscroller.start(this, document.getElementsByTagName('wrapper'));
				},

				onStop : function(){
					$.iAutoscroller.stop();
				}

			}

		);
});
