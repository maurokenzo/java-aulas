$('document').ready(function(){

	// Janela Modal para navegadores antigos	
	var browserDetection = function(){
		
		// pegando o user agent do navegador
		var ua = $.browser;
		
		// se os navegadores tiverem sido atualizados e/ou suportar novas features de CSS 2.1 e CSS 3
		if((!ua.msie)||(ua.msie && ua.version >= "8.0")){
			$('.boxBrowserModal').css('display', 'none');
		}
		
		// caso estejam utilizando o IE 6,7 e 8 em modo de compatibilidade emulando o IE 7
		// janela com sugestão de atualização do navegador aparecerá.
		if(ua.msie && ua.version < "8.0"){			
			$(function(){
				$('.boxBrowserModal').css('display', 'block');
				$('.boxBrowserModal').dialog({
					resizable: false,
					draggable: false,
					width:545,
					height:380,
					modal: true
				});
				$("#imgBoxBrowserModal").click(function(){
					$('.boxBrowserModal').dialog('close');
				});
			});
		}
	};
	
	// inicializando o script de detecção do navegador.
	browserDetection();
	
	
	// Menu jQuery
	var ie = $.browser.msie && $.browser.version < 8.0;
 
	$.fn.menu = function() {
		$(this).find('li').each(function() {
			if ($(this).find('> ul').size() > 0) {
				$(this).addClass('has_child');
			}
		});

		var closeTimer = null;
		var menuItem = null;
		var timer = 200;	// quantidade de tempo antes do menu desaparecer (em milisegundos)
		
		function cancelTimer() {
			if (closeTimer) {
				window.clearTimeout(closeTimer);
				closeTimer = null;
			}
		}
		
		function close() {
			$(menuItem).find('> ul ul').hide();
			
			// efeito para o Internet Explorer (legado) - Fade; efeito para navegadores mais modernos - Slide;
			ie ? $(menuItem).find('> ul').fadeOut() : $(menuItem).find('> ul').slideUp('fast');
			
			menuItem = null;
		}
		
		$(this).find('li').hover(function() {
			cancelTimer();
			
			var parent = false;
			$(this).parents('li').each(function() { 
				if (this == menuItem) parent = true;
			});
			if (menuItem != this && !parent) close();
			
			$(this).addClass('hover');
			
			// efeito para o Internet Explorer (legado) - Fade; efeito para navegadores mais modernos - Slide;
			ie ? $(this).find('> ul').fadeIn() : $(this).find('> ul').slideDown('fast');
			
		}, function() {
			$(this).removeClass('hover');
			menuItem = this;
			cancelTimer();
			closeTimer = window.setTimeout(close, timer);
		});
		
		if (ie) {
			$(this).find('ul a').css('display', 'inline-block');
			$(this).find('ul ul').css('top', '0');
		}
	}	

	// inicializando o menu em JQuery.
	$('.menu').menu();
	
	
	
	
});

