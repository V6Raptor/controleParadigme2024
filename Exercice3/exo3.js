const DNAStrand = (dna) => {
    let complement = '';
    
    for (let i = 0; i < dna.length; i++) {
        let lettre = dna[i];
        
        if (lettre === 'A') {
            complement += 'T';
        } else if (lettre === 'T') {
            complement += 'A';
        } else if (lettre === 'C') {
            complement += 'G';
        } else if (lettre === 'G') {
            complement += 'C';
        } else {
            complement += lettre;
        }
    }

    return complement;
};

console.log(DNAStrand("ATTGC"));
console.log(DNAStrand("GTAT"));
