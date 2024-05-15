const numtel = (num) => {
    const parts = [
        num.slice(0, 3).join(''),
        num.slice(3, 6).join(''),
        num.slice(6).join('')
    ];

    return `(${parts[0]}) ${parts[1]}-${parts[2]}`;
};

console.log(numtel([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]));
