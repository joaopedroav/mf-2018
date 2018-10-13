$(document).ready(function () {
  $.getJSON("estabelecimentos.json", function (data) {
    var estabelecimentos = data;
    var saida = '<tr><th>Código CNES</th><th>Razão social</th></tr>';
    var total = estabelecimentos.length;
    for (i = 0; i < 100; i++) {
      var coCnes = estabelecimentos[i].coCnes.replace("\"", "");
      coCnes = coCnes.replace("\"", "");
      var razaoSocial = estabelecimentos[i].razaoSocial.replace("\"", "");
      razaoSocial = razaoSocial.replace("\"", "");
      saida += '<tr>';
      saida += '<td>' + coCnes + '</td>';
      saida += '<td>' + razaoSocial + '</td>';
      saida += '</tr>';
      $("#conteudo").html(saida);
    }
  });
  return false;
});

function pesquisar() {
  var input, filter, table, tr, td, td2, i;
  input = document.getElementById("pesquisa");
  filter = input.value.toUpperCase();
  table = document.getElementById("conteudo");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    td2 = tr[i].getElementsByTagName("td")[1];
    if (td || td2) {
      if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else if (td2.innerHTML.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}
