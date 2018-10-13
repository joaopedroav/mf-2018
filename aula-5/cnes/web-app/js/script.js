function generateTable(currentPage) {
  this.URL = "estabelecimentos.json";
  $.getJSON(URL, function (data) {
    const pages = Math.ceil(50 / 10);
    $("#conteudo, #paginacao").empty();
    for (let i = currentPage * 10; i < (currentPage * 10) + 10; i++) {
      let post = data[i];
      var coCnes = post.coCnes.replace("\"", "");
      coCnes = coCnes.replace("\"", "");
      var razaoSocial = post.razaoSocial.replace("\"", "");
      razaoSocial = razaoSocial.replace("\"", "");
      let tblRow = "<tr>" + "<td>" + coCnes + "</td>" + "<td>" + razaoSocial + "</td>";
      $(tblRow).appendTo("#conteudo");
    }
    for (let i = 1; i <= pages; i++) {
      let pagingHtml = "<a href=# onclick=generateTable(" + (i - 1) + ")>" + " " + i + " " + "</a>"
      $(pagingHtml).appendTo("#paginacao");
    }
  })
}
generateTable(0);

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
