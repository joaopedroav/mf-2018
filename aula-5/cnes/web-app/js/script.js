$(document).ready(function () {
    $.getJSON("estabelecimentos.json", function (data) {
        var estabelecimentos = data;
        var saida = '<tr><th>Código CNES</th><th>Razão social</th></tr>';
        var total = estabelecimentos.length;
        for (i = 0; i < 100; i++) {
            saida += '<tr>';
            saida += '<td>' + estabelecimentos[i].coCnes + '</td>';
            saida += '<td>' + estabelecimentos[i].razaoSocial + '</td>';
            saida += '</tr>';
            $("#conteudo").html(saida);
        }
    });
    return false;
});