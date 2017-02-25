$(window).load(function() {
	$(function(){

		var windowWidth = $(window).width() / 2 + 125;
		$('h1').width(windowWidth);
		$(window).resize(function(){
			var windowWidth = $(window).width() / 2 + 125;
			$('h1').width(windowWidth);
		});

		$("#btnModalLogin").click(function(e){
			e.preventDefault();
			$("#modalLogin").css({"opacity": 1, "visibility":"visible"});
		});

		$("#btnModalContato").click(function(e){
			e.preventDefault();
			$("#modalContato").css({"opacity": 1, "visibility":"visible"});
		});

		$(".btnFecharModal").click(function(e){
			e.preventDefault();
			console.log('oi');
			$(".dialog").css({"opacity": 0, "visibility":"hidden"});
		});


		/*$("#numero").keyup(function () { 
		    this.value = this.value.replace(/[^0-9\.]/g,'');
		});*/
		
		$('#data').mask('99/99/9999');
		$('#cep').mask('99999-999');
		$('#cpf').mask('999.999.999-99');
		$('#cnpj').mask('99.999.999/9999-99');

		if ( $('#telefone').length > 10 ) {
			$('#telefone').mask('(99) 99999-999?9');
		} else {
			$('#telefone').mask('(99) 9999-9999?9');
		}

		function autoCompletarEndereco(v) {
			if ( $( '#campoCep' ).length ) {

				// CEP válido.
				var cep       = $( '#campoCep' ).val().replace( '.', '' ).replace( '-', '' ),
					logradouro = $( '#campoLogradoudo' ).val();

				// Check country is BR.
				if ( cep !== '' && 8 === cep.length &&  0 === logradouro.length ) {

					// Recuperando endereço api CORREIOS.
					$.ajax({
						type: 'GET',
						url: '//correiosapi.apphb.com/cep/' + cep,
						dataType: 'jsonp',
						crossDomain: true,
						contentType: 'application/json',
						success: function (resposta) {

							// Logradouro.
							if ( '' !== resposta.tipoDeLogradouro ) {
								$( '#campoLogradouro' ).val( resposta.tipoDeLogradouro + ' ' + resposta.logradouro ).change();
							} else {
								$( '#campoLogradouro' ).val( resposta.logradouro ).change();
							}

							// Bairro.
							$( '#campoBairro' ).val( resposta.bairro ).change();

							// Cidade.
							$( '#campoCidade' ).val( resposta.cidade ).change();

							// Estado.
							$( '#campoEstado option:selected' ).attr( 'selected', false ).change();
							$( '#campoEstado option[value="' + resposta.estado + '"]' ).attr( 'selected', 'selected' ).change();

						}
					});
				}
			}
		}

	});

});