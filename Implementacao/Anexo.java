<!DOCTYPE html>
<html>

<head>
   <style>
      .container {
         width: 100%;
      }

      .descricaoAcervoFotografico {
         margin: 5px;
         color: #485a6a;
         font-family: "Open Sans";
      }

      .descricaoAcervoFotografico i {
         font-size: 30px;
      }

      .tituloAcervoFotografico {
         display: inline-block;
         margin: 10px;
      }

      .subtituloAcervoFotografico p {
         margin-top: 5px !important;
      }

      .control-label {
         color: #a1998d;
         font-size: 15px;
         font-weight: 600;
         white-space: nowrap;
         margin-top: 7px
      }

      .styleMenudinamicoAcervo input,
      .styleMenudinamicoAcervo select,
      .styleMenudinamicoAcervo .select2-selection {
         border: 1px solid #a1998d !important;
      }

      .buscarFotos,
      .gerarRelatorioFotografico,
      .adicionarFotos {
         margin-right: 1.32%;
         background-color: #D9438D;
         color: #fff !important;
         margin-bottom: 1rem;
      }

      .gerarRelatorioFotografico button {
         background: none;
         border: none;
         text-transform: inherit;
      }

      .adicionarImagem {
         margin-right: 1.5%;
         background-color: #4b77be;
         color: #fff !important;
      }

      #selecionarTodos {
         display: flex;
         justify-content: space-between;
      }

      @media screen and (max-width: 762px) {
         #selecionarTodos {
            display: flex;
            flex-direction: column;
         }

         .btnSelecionarTodos {
            margin-top: 2px;
            margin-left: 0px;
         }
      }

      .btn.btnSelecionarTodos {
         padding: 5px 20px 7.5px !important;
      }

      .justify-content-end {
         justify-content: end;
      }

      fieldset {
         border: 1px solid #a1998d;
         border-radius: 10px;
         padding: 4rem;
         margin-bottom: 1.25rem;
         background: white !important;
         margin: 4rem;
      }


      /* Acervo Fotografico - Inicio */
      #acervoFotografico .background_cards {
         margin-top: 20px;
         padding-top: 30px;
         position: relative;
         z-index: 0;
         text-align: center;
      }

      .rowAcervoFotografico {
         display: flex;
         justify-content: center;
         align-items: center;
         height: 100vh;
         flex-wrap: wrap;
      }

      #acervoFotografico .div_cards {
         margin: 0px 2.5%;
         word-break: break-all !important;
         display: contents;
      }

      #acervoFotografico .cards {
         position: relative;
         background: #f5f5f5;
         transition: 0.3s;
         width: 28%;
         height: 410px;
         margin-bottom: 40px;
         border: none;
         border-radius: 40px;
         padding: 0px;
         margin: 0px 2.5% 2%;
      }

      #acervoFotografico .cards img {
         width: 100%;
         height: 300px;
         overflow: hidden;
         margin-bottom: 3%;
      }

      #acervoFotografico .cards h4 {
         font-weight: 600;
         font-size: 15px;
         margin-bottom: 2px;
         word-wrap: break-word;
         white-space: normal;
         overflow-wrap: break-word;
         padding: 0px 5px;
      }

      .btnSelecionarTodos {
         font-weight: bolder;
         font-family: "Open Sans";
         height: 20%;
         margin-left: 17.5px;
      }

      .selecionarTodos {
         background-color: #9b9a9ad6;
         color: #ffffff !important;
      }

      .selecionarTodosAtivo {
         background-color: #f5f5f5;
         color: #0075ff !important;
      }

      #acervoFotografico .cards .span_data {
         font-weight: 200;
         font-size: 17px;
         margin-bottom: 1px;
         font-family: cursive;
      }

      #acervoFotografico .checkboxCard {
         position: absolute;
         margin: 14px;
         width: 25px;
         height: 30px;
         border-radius: 50%;
      }

      #acervoFotografico .cards:hover {
         transform: scale3d(1.1, 1.1, 1);
      }

      #corpoContainerAcervo {
         border: 1px solid #a1998d;
         border-radius: 1rem;
         background: #99989626;
      }

      .cabecalhoAcervoFotografico {
         background: #F5F6FA;
         padding: 15px 0;
         border-top: 5px solid #D9438D;
         margin-bottom: 2rem;
         display: flex;
         flex-direction: column;
      }

      .cabecalhoMarginAcervo {
         display: flex;
         align-items: center;
         font-weight: 600;
         margin: 1px 0 0 0;
      }

      #logoTopoAcervo {
         width: 17rem;
      }

      .informacoesContrato {
         margin: 3rem 4rem 0 4rem;
      }

      /* Acervo Fotografico - Fim */
   </style>
</head>

<body>
   <section class="tab cabecalhoAcervoFotografico">
      <div class="row cabecalhoMarginAcervo">
         <div class="col-xs-12 col-md-6"><img id="logoTopoAcervo" src="../Imagens/aparencia/customizado/LogoEllosP.png">
         </div>

         <div class="col-xs-12 col-md-6 text-right"><span class="titulo">ACERVO FOTOGRÁFICO</span></div>
      </div>
   </section>
   <div class="container" id="corpoContainerAcervo">
      <div class="informacoesContrato">
         <div class="row descricaoAcervoFotografico">
            <h4 class="subtituloAcervoFotografico">
               <p> Esta página é a sua ferramenta central para gerenciar fotos.</p>
               <p>Por aqui você pode listar todas as fotos diárias, importadas no "Diário de Obras", de um contrato
                  específico em um período informado, marcar as fotos desejadas e gerar um Relatório Fotográfico (RFTO)
                  personalizado.
               </p>
               <p>Além disso, por aqui também é possível importar novas fotos, informando seu contrato, data, descrição
                  e local.</p>
            </h4>
         </div>
         <div class="row">
            <div class="form-group styleMenudinamicoAcervo col-xs-12 col-sm-4 col-md-4 col-lg-3">
               <label class="control-label">Contrato: </label>
               <select class="form-control date-picker" name="contratos" id="listaContratosMenuDinamico"></select>
            </div>

            <div class="form-group styleMenudinamicoAcervo col-xs-12 col-sm-4 col-md-4 col-lg-3">
               <label class="control-label">Data Início: </label>
               <input id="dataInicio" class="form-control dataInput" placeholder="DD/MM/YYYY" type="date" min=""
                  max="" />
            </div>
            <div class="form-group styleMenudinamicoAcervo col-xs-12 col-sm-4 col-md-4 col-lg-3">
               <label class="control-label">Data Fim: </label>
               <input id="dataFim" class="form-control dataInput" placeholder="DD/MM/YYYY" type="date" min="" max="" />
            </div>
         </div>

         <div class="row mt-3">
            <div class="col-xs-12 col-sm-4 col-md-4 col-lg-3">
               <button id="adicionarFotos" type="button" class="btn adicionarFotos col-xs-12"><i class="fa fa-plus"
                     aria-hidden="true"></i>&nbsp; Adicionar
                  Foto</button>
            </div>
            <div class="col-xs-12 col-sm-4 col-md-4 col-lg-3">
               <button id="buscarFotos" type="button" class="btn buscarFotos col-xs-12"><i class="fa fa-search"
                     aria-hidden="true"></i>&nbsp Buscar Fotos</button>
            </div>
         </div>
      </div>

      <div class="row acervoFotografico" id="acervoFotografico">
         <div id="selecionarTodos" class=" col-xs-12">
         </div>


         <div class="background_cards">
            <div class="container">
               <div class="row" class="rowAcervoFotografico" id="rowAcervoFotografico">

               </div>
            </div>
         </div>
      </div>
      <script>
         var listaParaGerarRelatorio = [];
         var indexParalistaParaGerarRelatorio = 0;
         var chave = "dados";
         var dadosContrato = '<option value="">Selecione</option>';
         var botaoSelecionarTodos = '<div class="btn selecionarTodos btnSelecionarTodos col-xs-12 col-sm-12 col-md-4 col-lg-3 " id="btnSelecionarTodos"><input type="checkbox" /><span data-darkreader-inline-color=""> Selecionar Todos</span></div><div id="gerarRelatorioFotografico" class="btn buscarFotos gerarRelatorioFotografico col-xs-12 col-sm-12 col-md-4 col-lg-3"><button id="btnGerarRelatorioFotografico" type="button" class="col-xs-12"><i class="fa fa-download" aria-hidden="true"></i></i>&nbsp Gerar Relatório Fotográfico</button></div>';
         var todosOsCards;
         var x = [];
         var lista = [];
         var arquivosSelecionados = [];
         var posicaoDoArrayDaLista = 0;
         $(document).ready(() => {
            $("#adicionarFotos").on('click', ExibirDocumentoEncontrado);
            definindoLimiteData();
            preencherCheckbox();
            buscarContratos();

            $("#dataInicio").off('change').on('change', definindoLimiteData);
            $("#dataFim").off('change').on('change', definindoLimiteData);

            $("#buscarFotos").off('click').on('click', function () {
               if ($("#listaContratosMenuDinamico").val() == "") {
                  Ecm.alertInfo("Por favor, selecione um contrato");
               } else {
                  Ecm.bloquearElemento(".portlet.box.blue-steel");
                  buscarDadosFotos();
               }
            });

         });

         function selecionarTodos() {
            todosOsCards = $(".div_cards");
            $meuCheckbox = $("#selecionarTodos").find("input");

            alterandoEstiloBotaoSelecionarTodos();
            for (var i = 0; todosOsCards.length >= i; i++) {
               $(todosOsCards[i]).find("input").prop("checked", $meuCheckbox.prop("checked"));
            }
         }
         function preencherCheckbox() {
            $(".div_cards").on('click', function (e) {
               if (!$(e.target).is("input")) {
                  var $meuCheckbox = $(this).find("input");
                  $meuCheckbox.prop("checked", !$meuCheckbox.prop("checked"));
                  if (!$meuCheckbox.prop("checked")) {
                     $checkboxSelecionarTodos = $("#btnSelecionarTodos").find("input");
                     $checkboxSelecionarTodos.prop("checked", false);
                     alterandoEstiloBotaoSelecionarTodos()
                  }
               }
            });
            $(".checkboxCard").on('click', function (e) {
               if ($(e.target).prop("checked") == false) {
                  $checkboxSelecionarTodos = $("#btnSelecionarTodos").find("input");
                  $checkboxSelecionarTodos.prop("checked", false);
                  alterandoEstiloBotaoSelecionarTodos()
               }
            });
            $("#gerarRelatorioFotografico").off('click').on('click', function () {
               if (false) {

               } else {
                  gerarRelatorioFotografico();
               }
            });
            $("#btnSelecionarTodos").on('click', function (e) {
               if (!$(e.target).is("input")) {
                  var $meuCheckbox = $(this).find("input");
                  $meuCheckbox.prop("checked", !$meuCheckbox.prop("checked"));
                  selecionarTodos();
               }
            });
            $("#btnSelecionarTodos").find("input").on('click', function (e) {
               e.stopPropagation();
               selecionarTodos();
            });
         }
         function alterandoEstiloBotaoSelecionarTodos() {
            $divSelecionarTodos = $("#selecionarTodos").find(".btnSelecionarTodos");
            if ($divSelecionarTodos.find("input").prop("checked")) {
               $divSelecionarTodos.removeClass("selecionarTodos").addClass("selecionarTodosAtivo");
            } else {
               $divSelecionarTodos.removeClass("selecionarTodosAtivo").addClass("selecionarTodos");
            }
         }
         function buscarDadosFotos() {
            var dadosImagem = '';
            var dataInicio = $("#dataInicio").val();
            var dataFim = $("#dataFim").val();
            var numContrato = $("#listaContratosMenuDinamico").val();
            let parametros_imagens = {
               "extrasArrayJson": [
                  {
                     "Chave": chave,
                     "Valor": {
                        "NumContrato": numContrato,
                        "DataInicio": dataInicio,
                        "DataFim": dataFim
                     }
                  }
               ]
            };
            $.ajax({
               type: "POST",
               url: BASE_URL + `api/v2/documentos/script-externo/44`,
               headers: {
                  authorization: "Bearer " + Ecm.token,
               },
               data: JSON.stringify(parametros_imagens),
               contentType: "application/json; charset=utf-8",
               dataType: "json",
            }).then(function (data) {
               var fotos = data.objeto;
               Object.entries(fotos).forEach(function ([keyFoto, foto]) {

                  var dataFormatada = convertDataToDDMMYYYY(foto.data);
                  incrementandoDadosParaGerarRelatorio(foto);
                  dadosImagem += '<div class="col-xs-3 col-xl-2 div_cards"><div id=' + foto.caminhoArquivo + ' class="btn cards"><input class="checkboxCard" id="checkboxCard' + keyFoto + '" id="" type="checkbox"><img src=data:image/jpg;base64,' + foto.base64 + ' alt=""><h4>' + foto.descricao + '</h4><div class="row"><span class="span_data">' + dataFormatada + '</span></div><div class="row"><span> ' + foto.estacao + '</span></div></div></div>';
               });

               var idAcervoFotografico = $("#acervoFotografico");
               var verificarFieldsetAcervoFotografico = idAcervoFotografico.closest("fieldset");
               $("#selecionarTodos").html("");
               $("#selecionarTodos").html(botaoSelecionarTodos);
               $("#rowAcervoFotografico").html("");
               $("#rowAcervoFotografico").html(dadosImagem);
               if (verificarFieldsetAcervoFotografico.length === 0) {
                  $("#acervoFotografico").wrap('<fieldset></fieldset>');
               }
               Ecm.desbloquearElemento(".portlet.box.blue-steel");

               preencherCheckbox();
            }).fail(function (error) {
               console.log(error);
            })

         }
         function realizarDownload(base64) {
            let base64String = base64
            let dataFormatada = moment().format('DD/MM/YYYY');
            // Decodificar a sequência base64 para um array de bytes
            let byteCharacters = atob(base64String);
            let byteNumbers = new Array(byteCharacters.length);
            for (let i = 0; i < byteCharacters.length; i++) {
               byteNumbers[i] = byteCharacters.charCodeAt(i);
            }
            let byteArray = new Uint8Array(byteNumbers);

            // Criar um Blob a partir do array de bytes
            let blob = new Blob([byteArray], { type: 'application/pdf' });

            // Criar uma URL para o Blob
            let url = URL.createObjectURL(blob);

            let link = document.createElement('a');
            link.href = url;
            link.download = `Relatório Diário de Obra Rascunho - ${dataFormatada}.pdf`;

            document.body.appendChild(link);
            link.click();

            URL.revokeObjectURL(url);
         }

         function preencherTelaComFotos(dadosAcervoFotografico) {
            Object.keys(dadosAcervoFotografico).forEach(function (foto) {
            });
         }
         function convertDataToDDMMYYYY(data) {
            data = new Date(data);
            var ano = data.getFullYear();
            var mes = data.getMonth() + 1;
            var dia = data.getDate();
            if (dia < 10) { dia = "0" + dia; }
            if (mes < 10) { mes = "0" + mes; }

            return `${dia}/${mes}/${ano}`;
         }
         function convertDataYYYYMMDD(data) {
            for (var i = 0; i < data.length; i += 5) {
               var dia = data.substr(i, 2);
               var mes = data.substr(i + 2, 2);
               var ano = data.substr(i + 4);
               var dataPadrao = ano + "-" + mes + "-" + dia;
               return dataPadrao;
            }
         }
         function definindoLimiteData() {
            var today = new Date();
            var threeMonthsAgo = new Date(today);
            threeMonthsAgo.setMonth(today.getMonth() - 3);
            var $datas = [$("#dataInicio"), $("#dataFim")];

            var minData = threeMonthsAgo.toISOString().split('T')[0];
            var maxData = today.toISOString().split('T')[0];
            var minDataFim = $datas[0].val();


            if ($datas[0].val() == "") { $datas[0].val(minData) }
            if ($datas[1].val() == "") { $datas[1].val(maxData) }

            $("#dataInicio").prop("min", minData);
            $("#dataInicio").prop("max", maxData);
            $("#dataFim").prop("min", minDataFim);
            $("#dataFim").prop("max", maxData);
            var dataInicio = new Date($datas[0].val());
            var dataFim = new Date($datas[1].val());

            if (dataInicio > dataFim) {
               $("#dataFim").val($("#dataInicio").val());
            }
         }
         function buscarContratos() {
            let parametros_contratos = {
               "extrasArrayJson": [
                  {
                     "Chave": "dados",
                     "Valor": Ecm.retornaUsuario().id
                  }
               ]
            };
            $.ajax({
               type: "POST",
               url: BASE_URL + `api/v2/documentos/script-externo/46`,
               headers: {
                  authorization: "Bearer " + Ecm.token,
               },
               data: JSON.stringify(parametros_contratos),
               contentType: "application/json; charset=utf-8",
               dataType: "json",
            }).then(function (data) {
               var contratos = data.objeto;
               Object.entries(contratos).forEach(function ([key, contrato]) {
                  dadosContrato += '<option value="' + contrato + '">' + contrato + '</option>';
               });
               $("#listaContratosMenuDinamico").html("");
               $("#listaContratosMenuDinamico").html(dadosContrato);
               $("#listaContratosMenuDinamico").select2();
            }).fail(function (error) {
               console.log(error);
            })

         }
         function incrementandoDadosParaGerarRelatorio(dados) {
            lista[posicaoDoArrayDaLista] = dados;
            posicaoDoArrayDaLista++;
         }
         function filtrandoDadosParaGerarRelatorio() {
            debugger
            var idMinhaImagem = [];
            var index = 0;
            todosOsCards = $(".div_cards");
            for (var i = 0; i < todosOsCards.length; i++) {
               idMinhaImagem[index] = $(todosOsCards[i]).find("div").prop("id");
               var checado = $(todosOsCards[i]).find("input").prop("checked");
               if (checado) {
                  lista.forEach(function (foto) {
                     if (foto.caminhoArquivo == idMinhaImagem[index]) {
                        listaParaGerarRelatorio[indexParalistaParaGerarRelatorio] = foto;
                        indexParalistaParaGerarRelatorio++;
                     };
                  });

               }
               index++
            }

         }
         function gerarRelatorioFotografico() {
            debugger

            var numContrato = $("#listaContratosMenuDinamico").val();
            var json_parametros_relatorio = [];

            // arquivosSelecionados = 
            filtrandoDadosParaGerarRelatorio();
            if (listaParaGerarRelatorio == "" || listaParaGerarRelatorio == null || listaParaGerarRelatorio == undefined || listaParaGerarRelatorio.length == 0) {
               Ecm.alertInfo("Selecione a(s) imagem(imagens) que irão conter no seu Relatório");
            } else {
               Ecm.bloquearElemento(".portlet.box.blue-steel");

               console.log(listaParaGerarRelatorio);
               listaParaGerarRelatorio.forEach(function (foto, index) {
                  json_parametros_relatorio[index] = {}; // Inicializa o objeto interno
                  json_parametros_relatorio[index].Estacao = foto.estacao;
                  json_parametros_relatorio[index].Data = foto.data;
                  json_parametros_relatorio[index].Descricao = foto.descricao;
                  json_parametros_relatorio[index].CaminhoArquivo = foto.caminhoArquivo;
               });


               let parametros_relatorio = {
                  "extrasArrayJson": [
                     {
                        "Chave": "dados",
                        "Valor": {
                           "NumContrato": numContrato,
                           "Registros": json_parametros_relatorio
                        }
                     }
                  ]
               };

               $.ajax({
                  type: "POST",
                  url: BASE_URL + `api/v2/documentos/script-externo/47`,
                  headers: {
                     authorization: "Bearer " + Ecm.token,
                  },
                  data: JSON.stringify(parametros_relatorio),
                  contentType: "application/json; charset=utf-8",
                  dataType: "json",
               }).then(function (data) {
                  realizarDownload(data.objeto);
                  Ecm.desbloquearElemento(".portlet.box.blue-steel");
               }).fail(function (error) {
                  console.log(error);
                  Ecm.desbloquearElemento(".portlet.box.blue-steel");
               })
            }
         }
         // FUNÇÃO PARA ABRIR UM NOVO ACERVO FOTOGRÁFICO

         const objPadraoRequest = {
            headers: {
               "Content-Type": "application/json",
               "Authorization": Ecm.token
            },
            dataType: "JSON"
         }

         function ExibirDocumentoEncontrado() {

            const urlAbrirDocumento = `${BASE_URL}Autenticado/documentoVisualizacaoForm.aspx?documento=0&anexo=0&containerTipoId=2&pastaSuperior=0&processoId=22&processoVersaoId=2383&atividadeId=2&instanciaId=0&edicaoAutomatica=0`

            $.ajax({
               url: urlAbrirDocumento,
               type: "GET",
               headers: {
                  "Content-Type": "application/json",
                  "Authorization": Ecm.token
               }
            }).done(function (htmlModalECM) {
               $("#ajax-modal").html("");
               $("#ajax-modal").html(htmlModalECM);
               $("#ajax-modal").modal("show");
               Ecm.desbloquearElemento("#modal-form");
            }).fail(function (server_response) {
               console.log('error', server_response);
            });
         }

      </script>
</body>

</html>
