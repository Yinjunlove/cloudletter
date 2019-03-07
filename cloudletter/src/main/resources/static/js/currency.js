// 将number数值转化成为货币格式
$(function () {
    var currencyList = $(".currency");
    for (var i = 0; i < currencyList.length; i++) {
        var curr = $(currencyList[i]).html();
        $(currencyList[i]).html(currencyNoZero(curr,'',4));
    }

    //方法，把过长的显示字段，缩小用...代替，并鼠标移上去，可以看见全部
    $(".content").each(function () {
        var content = $(this).html();
        $(this).attr("title",content);
        if(content.length > 20){
            content = content.substring(0, 20) + "...";
        }
        $(this).html(content);
    });
});

var digitsRE = /(\d{3})(?=\d)/g;

// 将number数值转化成为货币格式方法，
// 第一个参数是数值，第二个参数是货币种类，第三个参数是保留位数
// 在指定保留位数中有带0的
function currencyNormal (value, currency, decimals) {
    value = parseFloat(value);
    if (!isFinite(value) || (!value && value !== 0)) return '';
    currency = currency != null ? currency : '';
    decimals = decimals != null ? decimals : 2;
    var stringified = Math.abs(value).toFixed(decimals);
    var _int = decimals
        ? stringified.slice(0, -1 - decimals)
        : stringified;
    var i = _int.length % 3;
    var head = i > 0
        ? (_int.slice(0, i) + (_int.length > 3 ? ',' : ''))
        : '';
    debugger
    var _float = decimals
        ? stringified.slice(-1 - decimals)
        : '';
    var sign = value < 0 ? '-' : '';
    return sign + currency + head +
        _int.slice(i).replace(digitsRE, '1,') +
        _float;
}

// 将number数值转化成为货币格式方法，
// 第一个参数是数值，第二个参数是货币种类，第三个参数是保留位数
// 在指定保留位数中无带0的
function currencyNoZero (value, currency, decimals) {
    value = parseFloat(value);
    if (!isFinite(value) || (!value && value !== 0)) return '';
    currency = currency != null ? currency : '';
    decimals = decimals != null ? decimals : 2;
    var stringified = Math.abs(value).toFixed(decimals);
    var _int = decimals
        ? stringified.slice(0, -1 - decimals)
        : stringified;
    var i = _int.length % 3;
    var head = i > 0
        ? (_int.slice(0, i) + (_int.length > 3 ? ',' : ''))
        : '';
    var _float = decimals
        ? stringified.slice(-1 - decimals)
        : '';
    var price = parseFloat(_float)+'';
    _float = price==0 ? '' : price.replace("0.", ".");
    var sign = value < 0 ? '-' : '';
    return sign + currency + head +
        _int.slice(i).replace(digitsRE, '1,') +
        _float;
}


