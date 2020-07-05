// Redimensionamento de texto via jQuery
	$(function(){
		$('.content h1','.content .breadCrumb','.content .breadCrumb','.content a','.content div','.content p').jfontsize({
			btnMinusClasseId: '#jfontsize-minus',
		    btnDefaultClasseId: '#jfontsize-default',
		    btnPlusClasseId: '#jfontsize-plus',
            btnMinusMaxHits: 1,
            btnPlusMaxHits: 2,
            sizeChange: 1
		});		
	});