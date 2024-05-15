const maskify = (numcarte) => {
    if (numcarte.length <= 4) {
        return numcarte;
    } else {
        return '#'.repeat(numcarte.length - 4) + numcarte.slice(-4);
    }
};

console.log(maskify('4556364607935616'));
console.log(maskify('1'));
console.log(maskify('11111'));