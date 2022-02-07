import FormCard from 'components/FormCard';
import { useParams } from 'react-router-dom';
import { Movie } from 'types/movie';
import './form.css';

type Props = {
    movie: Movie;
}
const Form = () => {

    const params = useParams();

    return (
        <FormCard movieId={`${params.movieId}`} />
    );

}

export default Form;