// Redimensionamento de texto via jQuery
	$(function(){
		// $('.content h1', '.content .breadCrumb')
		$('.content h1').jfontsize({
			btnMinusClasseId: '#jfontsize-minus',
		    btnDefaultClasseId: '#jfontsize-default',
		    btnPlusClasseId: '#jfontsize-plus',
            btnMinusMaxHits: 1,
            btnPlusMaxHits: 2,
            sizeChange: 1
		});
		$('.content .breadCrumb').jfontsize({
			btnMinusClasseId: '#jfontsize-minus',
		    btnDefaultClasseId: '#jfontsize-default',
		    btnPlusClasseId: '#jfontsize-plus',
            btnMinusMaxHits: 1,
            btnPlusMaxHits: 2,
            sizeChange: 1
		});
		$('.content a').jfontsize({
			btnMinusClasseId: '#jfontsize-minus',
		    btnDefaultClasseId: '#jfontsize-default',
		    btnPlusClasseId: '#jfontsize-plus',
            btnMinusMaxHits: 1,
            btnPlusMaxHits: 2,
            sizeChange: 1
		});
		$('.content div').jfontsize({
			btnMinusClasseId: '#jfontsize-minus',
		    btnDefaultClasseId: '#jfontsize-default',
		    btnPlusClasseId: '#jfontsize-plus',
            btnMinusMaxHits: 1,
            btnPlusMaxHits: 2,
            sizeChange: 1
		});
		$('.content p').jfontsize({
			btnMinusClasseId: '#jfontsize-minus',
		    btnDefaultClasseId: '#jfontsize-default',
		    btnPlusClasseId: '#jfontsize-plus',
            btnMinusMaxHits: 1,
            btnPlusMaxHits: 2,
            sizeChange: 1
		});
	});